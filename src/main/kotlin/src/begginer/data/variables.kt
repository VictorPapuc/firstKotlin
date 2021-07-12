package src.begginer.data


// types are notNulable by defaut
// to add null you need to add ?
var testVall: String? = null


val name = "Nick"

//Like in JavaScript it will recognize the type without specifying it
val age = 1;
var greeting = "hello"

fun main() {

    testVall = "Some String"
    if (testVall !== null) {
        //String concatanation
        println("You made it " + name);

        //Template String
        print("At the age of $age")
    } else {
        println(greeting)
    }

    //Immutable and Mutable variables
    //val cannot be changed only if you change it to var
    // name = testVall as String;

}

