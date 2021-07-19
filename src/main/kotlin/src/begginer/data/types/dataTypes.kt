package src.begginer.data.types


fun main() {
    //Declared types
//String
    val name: String = "Victor"
//Integer
    val age: Int = 11
    val myByte: Byte = 13
    val myShort: Short = 125;
    val myLong: Long = 12_02_02_21_21_31
    val myFloat: Float = 13.36f
    val myDouble: Double = 3.13311313131313
//Boolean
    var isSunny: Boolean = true

//String
    var charr: Char = 'a'

    val firstChar = name[0];
    val lastChar = name[name.length - 1]

    println("First char in my name is $firstChar")
    println("Last char in my is $lastChar")

}
