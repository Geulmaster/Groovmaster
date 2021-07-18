package Groovmaster

String filePath = "test.txt"
File myFile = new File(filePath)

// string
println myFile.text

// collect lines into a list

def list = myFile.collect { it }
println "list: $list"

// read file into list of strings
def lines = myFile.readLines()
println "lines: $lines"

// iterate on lines
myFile.eachLine { line ->
    println "$line"
}

// iterate on lines with index
myFile.eachLine { line, lineNum ->
    println "$lineNum: $line"
}

// add to list only if line is in range
def lineRange = 2..4
def lineList = []
myFile.eachLine { line, lineNum ->
    if(lineRange.contains(lineNum)) {
        lineList.add(line)
    }
}
println "$lineList"

// list files in dir
new File("C:\\Users\\eyalg\\Desktop\\AVA\\uni").eachFile {
    files -> println files.getAbsolutePath()
}

// list files in dir and sub dirs
new File("C:\\Users\\eyalg\\Desktop\\AVA\\uni").eachFileRecurse {
    files -> println files.getAbsolutePath()
}

// copy file data to another file
def newFile = new File("test2.txt")
newFile << myFile.text

// write data to file

File nFile = new File("data.txt")
nFile.write("This is line 1\n")
nFile << "This is line 2\n"
nFile.append("This is line 3")
println nFile.text

// rename file
nFile.renameTo(new File("newFile.txt"))