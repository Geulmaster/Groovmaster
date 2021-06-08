package Groovmaster

// for

for (int i=1; i<5; i++) {
    println i
}

// for in

for(a in 1..5){
    println a
}

// $it

5.times { println "$it" }

// step

1.step(10, 2) { println "$it" }

// iterate over a map
def map = ["name":"Groovy", "type": "language"]
for (e in map) {
    println e.key
    println e.value
}

// while

int i=1
while(i<5) {
    println i
    i = i+1
}