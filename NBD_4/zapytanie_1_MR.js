var map = function(){
var key = this.sex;
var values = {"weight":parseFloat(this.weight), "height":parseFloat(this.height),"count":1};
emit(key,values);
};

var reduce = function(key, values) { return {"height": Array.sum(values.map(x => x["height"])),"weight": Array.sum(values.map(x => x["weight"])), "count": Array.sum(values.map(x => x["count"])) } };

var finalize = function(key,values){return{"Height AVG":parseFloat(values.height/values.count),"Weight AVG":parseFloat(values.weight/values.count)};};

printjson(db.people.mapReduce(map, reduce, {finalize:finalize,out: { inline: 1 },}))

