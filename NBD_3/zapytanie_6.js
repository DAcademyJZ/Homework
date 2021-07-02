printjson(db.people.insertOne({
    "sex" : "Male",
    "first_name" : "Jakub",
    "last_name" : "Zawistowski",
    "job" : "krupier",
    "email" : "chce5@gmail.com",
    "location" : {
            "city" : "Warsaw",
            "address" : {
                    "streetname" : "Marszałkowska",
                    "streetnumber" : "7"
            }
    },
    "description" : "$$$",
    "height" : "180",
    "weight" : "85",
    "birth_date" : "1997-04-24T10:20:00Z",
    "nationality" : "Poland",
    "credit" : [
            {
                    "type" : "switch",
                    "number" : "9231256789231263",
                    "currency" : "USD",
                    "balance" : "10000"
            }
    ]
}))