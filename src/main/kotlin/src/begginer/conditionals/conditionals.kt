package src.begginer.conditionals

var condition: String? = "Do you belive in Strings"
var condition2: String? = "After Strings"


//how to condition

fun main() {

    /** If else condtions */

    condition = null;
    if (condition !== null) {
        println("T t t tnnnn t")
    } else {
        println("T t t tnnnn t")
    }


    val beliebe = if (condition !== null) condition else condition2
    println(beliebe)

    /** When condtions */

    val beliebe2 = when (condition) {
        null -> "yes"
        else -> "no"
    }

    when (condition) {
        null -> println("You do not believe")
        else -> println("You believe")
    }

    var jahreZeit = 4

    when (jahreZeit) {
        1 -> println("Fruhling")
        2 -> println("Sommer")
        3 -> {
            println("Herbst")
            println("Winter")
        }

        else ->
            println("not on the good planet")

    }

    var month = 3

    //from to
    when (month) {
        in 3..5 -> print("Fruhling")
        in 6..8 -> println("Sommer")
        in 9..11 -> println("Herbst")
        12, 1, 2 -> println("Herbst")
        else ->
            println("not on the good planet")
    }

    val age = 21

    when (age) {
        !in 0..20 -> println("You can drink in the us")
    }


    val x: Any = 13.3

    when (x) {
        is Int -> print("$x is an Int")
        !is Double -> println("$x is not a double")
        is String -> println("$x is a string")
        else -> println("Not any of the types")
    }



    /** While condtions */



}
