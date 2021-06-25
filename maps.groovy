package Groovmaster

def person = [
    "name" : "serhio",
    "age" : 13
]

println person
println person.name
println person["name"]
println person.get("age")
println person.getAt("age")

println person.size()

person.put("city", "Bruha")
println person

person.containsKey("city")
person.containsValue("Bruha")

println person.getClass()

def newPerson = person.clone()
println newPerson

person.each {key,value ->
    println "$key : $value"
}

person.eachWithIndex {key,value,i ->
    println "$i | $key : $value"
}

person.eachWithIndex {entry,i ->
    println "$i | $entry.key : $entry.value"
}