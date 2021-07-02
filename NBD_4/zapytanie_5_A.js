printjson(
  db.people.aggregate([
    {'$match': { "sex": "Female", "nationality": "Poland" }},
    { $unwind: "$credit"},
    {
      "$group" : {
        _id: "$credit.currency",

        suma:  { $sum: { $toDouble: "$credit.balance"} },
	srednia:  { $avg: { $toDouble: "$credit.balance"} }
      }
    },
    { "$project": { srednia: 1, suma: 1, _id:1} },
  ]).toArray()
);