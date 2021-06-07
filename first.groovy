package Groovmaster

class FirstClass {
    static void main(args) {
        println("yo yo yo")
    }
}

def name = "Eyal"
println "Name is ${name}"

/*
* Multi-line comment
*/

def (String a, int b, Double c) = [30,40,50]
println a
println b
println c

println a.getClass().getName()

Long d = 32
assert 2 ** 3 == 8
assert 9.intdiv(5) == 1
assert 2.2.plus(1.1) == 3.3

println Integer.toBinaryString(20)
println Integer.parseInt("20")


int i = 10
println i++
println i

println ((!false && false) == false) // equals true because the logical "not" has a higher priority than the logical "and"