package Groovmaster

try {
    int i = 1/0
}catch(Exception e) {
    println "Exception!"
    println e.getCause()
    println e.getMessage()
    // e.printStackTrace()
}finally{
    println "I'm done"
}