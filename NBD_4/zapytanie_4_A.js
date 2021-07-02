db.people.aggregate([
    { 
        $addFields: {
        height: {$convert: { input: "$height", to: "decimal" }},
	weight: {$convert: { input: "$weight", to: "decimal" }}
        }
    },
    { 
        $addFields: {
            bmi: { $divide: [ "$weight" , { $pow: [ { $divide: ["$height", 100]}, 2 ] } ] },
        }
    },
    { $group: { _id: "$nationality",maximum_Bmi: { $max: "$bmi" },  minimum_Bmi: { $min: "$bmi" }} }
]).forEach(a => printjsononeline(a))