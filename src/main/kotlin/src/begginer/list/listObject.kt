package src.begginer.list

fun main() {
    val aList = mutableListOf<String>("Cookies", "Milk", "Sugar")

    listTypes(aList);
}

fun listTypes(giveMeList: List<String>) {

    giveMeList.forEach { giveMeList ->
        println(giveMeList)
    }

    //list is Immutable by default
    val months = listOf("January", "February")
//    months.add -> Immutable list cannot be changed
    val otherMonth = mutableListOf("March, April");
    otherMonth.add("May");

    //map is Immutable by default

    val mapOfDays = mapOf(1 to "a", 2 to "b", 3 to "c")
//    mapOfDays.put -> Immutable list cannot be changed

    val mapOfOtherDays = mutableMapOf(1 to "Monday", 2 to "Thursday")
    mapOfOtherDays.put(3, "Wednesday")
}


