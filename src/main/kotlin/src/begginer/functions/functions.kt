package src.begginer.functions

fun sayHello(parameter1: String, parameter2: String?) {
    println(parameter1 + parameter2)
    println("Hello `${parameter1}`")
}

fun sayFuckOff(parameter1: String) = println("Hello `${parameter1}`")


fun main() {
    val doYou = "believe";
    val doNot: String? = null;
    sayHello(doYou, doNot);
    sayFuckOff("Fuck off")
    doThings();
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

