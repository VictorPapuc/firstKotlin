package src.oop.classes

class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is value $value")
        }
        get() {
            println("The returned value is $field ")
            return field;
        }

    fun printInfo() {
//        val nickNameToPrint = if (nickName !== null) nickName else "no nickname"
        //simplify above statement
        val nickNameToPrint = nickName ?: "No NickName";
        println("$firstName, $lastName  ($nickNameToPrint)")
    }


//    val firstName: String = _firstName
//    val lastName: String = _lastName  

    //init block to iniatilize variables
//    init {
//        firstName = _firstName;
//        lastName = _lastName;
//    }

//    init {
//        println("init 1")
//    }
//
//    constructor() : this("Peter", "Parker") {
//        println("Secondary Constructor")
//    }
//
//    init {
//        println("init 2")
//    }
}
