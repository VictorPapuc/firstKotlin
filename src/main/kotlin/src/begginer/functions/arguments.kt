package src.begginer.arguments


//In Kotlin you can declare an optional argument in the funtion parameter that can be declared on the call many times

fun main() {
    val anArray = arrayOf("bla", "bla", "blabla")
    greeting("Hello")
    greeting("Hello", "My", "Friend", "How", "Are", "You")
    greeting("Hello", *anArray)
    greetPerson();
    greetPerson("Blabla", "bba")
    greetPerson("b");
}


fun greeting(greeting: String, vararg whatToGreet: String) {
    println("$greeting $whatToGreet")
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") {
    println("$greeting $name")
}