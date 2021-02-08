package src.begginer.loops

fun main() {
    val isIt: Boolean = false;

    if (isIt) {
        typeOfLoopsInArrays();
    } else {
        typeOfLoopsInList()
    }
    typeOfLoopsInMaps()
}

//Arrays
fun typeOfLoopsInArrays() {
    val days = arrayOf("Monday", "Thursday", "Wednesday")

    //loop inside of
    for (days in days) {
        println(days);
    }

    days.forEach {
        println(it);
    }

    days.forEach { days
        ->
        println(days)
    }

    //iterate and keep the index
    days.forEachIndexed { index, days ->
        println("Interesting $days is at index $index")
    }
}

//List
fun typeOfLoopsInList() {
    val days = listOf("Monday", "Thursday", "Wednesday")
    println(days.get(1));
    days.forEach { days ->
        println(days)
    }
}

fun typeOfLoopsInMaps() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c");
    map.forEach { (key, value) ->
        println("$key -> $value")
    }
}

