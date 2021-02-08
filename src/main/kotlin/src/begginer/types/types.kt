package src.begginer.types


// types are notNulable by defaut
// to add null you need to add ?

var testVall: String? = null
val name: String = "Blabla"
var greeting: String? = "hello"

//Like in JavaScript it will recognize the type without specifying it
val naming = "ss"


fun main() {

    testVall = "Some String"
    if (testVall !== null) {
        println("You made it");
    } else {
        println(greeting)
    }

}

