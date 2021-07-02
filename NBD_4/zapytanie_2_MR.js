var map = function(){ this.credit.forEach(x => emit(x.currency, parseFloat(x.balance)) ) };

var reduce = function(key, values) { return Array.sum(values) };

printjson(db.people.mapReduce(map, reduce, {out: { inline: 1 },}))
