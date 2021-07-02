var map = function() { emit(this.job, ";)") };

var reduce = function(key, values) { return ";)" };

printjson(db.people.mapReduce(map, reduce, {out: { inline: 1 },}))
