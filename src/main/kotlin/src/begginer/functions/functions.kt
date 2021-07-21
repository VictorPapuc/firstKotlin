package src.begginer.functions


fun main() {
    val doYou = "believe";
    val doNot: String? = null;
    sayHello(doYou, doNot);
    sayFuckOff("Fuck off")
    doThings();
    val result = addUp(1, 2)

    println("$result is the result")
}


fun sayHello(parameter1: String, parameter2: String?) {
    println(parameter1 + parameter2)
    println("Hello `${parameter1}`")
}

fun sayFuckOff(parameter1: String) = println("Hello `${parameter1}`")

fun addUp(a: Int, b: Int): Int {
    return a + b
}


fun doThings() {
    val interesting = arrayOf("I", "Do", "not");
    val r = interesting.size;
    println(interesting[0] + r.toString() + interesting.get(2));

    for (interesting in interesting) {
        println(interesting);
    }

    interesting.forEach {
        println(it)
    }

    interesting.forEach { interesting ->
        println(interesting)
    }
}
