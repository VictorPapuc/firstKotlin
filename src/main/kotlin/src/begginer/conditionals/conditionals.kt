package src.begginer.conditionals

var condition: String? = "Do you belive in Strings"
var condition2: String? = "After Strings"


fun main() {
    //how to condition

    condition = null;
    if (condition !== null) {
        println("T t t tnnnn t")
    } else {
        println("T t t tnnnn t")
    }

    when (condition) {
        null -> println("You do not believe")
        else -> println("You believe")
    }

    val beliebe = if (condition !== null) condition else condition2
    println(beliebe)

    val beliebe2 = when (condition) {
        null -> "yes"
        else -> "no"
    }

}
