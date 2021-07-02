var map = function () {let b = this.weight  / (this.height * this.height*0.0001);emit(this.nationality,{ min: b,max: b,avg: { sum: b, count: 1 } });};

var reduce = function (key, value) {var max = 0;var min = 10002121;var sum = 1; var count =1;value.forEach(function (b) {if (b.min < min){min = b.min};sum += b.avg.sum;if (b.max > max){max = b.max};count++;});return {  min: min,max: max,avg: { sum: sum, count: count }}};
var finalize = function (key, value) {let y = value.avg.sum / value.avg.count;return { min: value.min,max: value.max,avg: y }};


printjson(db.people.mapReduce(map,reduce,{finalize: finalize,out: { inline: 1 }}));
