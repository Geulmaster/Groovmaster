package Groovmaster

def x = -7
def result = ""

switch(x) {
    case 0:
        result = "zero"
        break
    case {x>0}:
        result = "positive"
        break
    case {x<0}:
        result = "negative"
        break
    default:
        result = "invalid"
}

print result