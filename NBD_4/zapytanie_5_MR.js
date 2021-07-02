var map = function() { 
        if (this.nationality === "Poland" && this.sex == "Female") {
            this.credit.forEach(x => emit(x.currency, {"suma": parseFloat(x.balance), "count": 1} ) ) 
        }
    };

var reduce = function(key, values) {
        return { "sum": Array.sum(values.map(z => z["suma"])), "count": values.length }};

var finalize = function(key, value) {
            return {"total" : (value.sum), "average": (value.sum / value.count) }
        };

printjson(db.people.mapReduce(map, reduce, {finalize:finalize,out: { inline: 1 },}))


