package Groovmaster

def list1 = ["yo", "ko", "jo"]

println list1[1]
println list1[0..2]
println list1[2..0] //reverse

println list1.contains("ko") // true

println list1.size()

list1.add("ho")
println list1

list1.add(2, "bo") // add at index
println list1

list1.remove("yo")
println list1

list1 = list1 + [23,34]
// list1 = list1 - [23,34]

last = list1.pop()
list1.removeLast()

println list1.intersect([23,34]) // prints only specified values in list

list1 = list1.reverse()
println list1

list1 = list1.sort()

println list1.isEmpty()