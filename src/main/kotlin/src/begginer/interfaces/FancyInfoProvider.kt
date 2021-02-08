package src.begginer.interfaces

import src.BasicInfoProvider
import src.begginer.classes.Person

//clases are by default closed in Kotlin to extend a class you need to add the open keyword
class FancyInfoProvider : BasicInfoProvider() {
    override val provideInfo: String
        get() = "Fancy Info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }

    override val sessionIdPrefix: String
        get() = "Fancy Session"
}