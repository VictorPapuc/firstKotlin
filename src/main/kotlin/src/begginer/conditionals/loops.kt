package src.begginer.conditionals

fun main() {
    var y = 1
    while (y <= 1) {

        println("$y")
        y++
    }

    println("\nLoop is Done")

    var x = 1;
    do {
        println("$x");
        x++
    } while (x <= 10)

    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }



    for (num in 1..10) {
        println("$num")
    }

    for (i in 1 until 10) {
        println("$i")
    }


    println("")
    for (i in 10 downTo 1) {
        println("$i")
    }

    for (i in 10 downTo 1 step 2) {
        println("$i")
    }


}