package Groovmaster

def name = "Eyal"
println name

def fewLines = '''few
lines'''

println fewLines

println name.length()
println name[3]
println name.indexOf('l')
println name[0..2]

println fewLines-("lines")

println fewLines.replace("lines", "jojo")
println fewLines.toLowerCase()
println fewLines.toUpperCase()
println fewLines.toList()
println fewLines.split()
println "aa".equals("aa")