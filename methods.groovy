package Groovmaster

def printHello() {
    println "Hello"
}

printHello()

def sum(int a, int b) {
    println "Sum is " +(a+b)
}

sum(3, 2)


class Methods {
    
    static void main(args) {
        Methods func = new Methods()
        func.function()
    }

    def function() {
        println ("yoyo")
    }
}

new Methods().main()