package src

import src.oop.classes.Person
import src.oop.interfaces.FancyInfoProvider

interface PersonInfoProvider {
    val provideInfo: String;

    fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String {
        return String()
    }
}

//Multiple interfaces can be implemented
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    protected open val sessionIdPrefix = "Session"

    override val provideInfo: String
        get() = "Basic Info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print stuff")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val prov = object : PersonInfoProvider {
        override val provideInfo: String
            get() = "New  Info Provider"

        fun getSessionId() = "id";
    }
    prov.printInfo(Person());
    prov.getSessionId();
//    println(prov.sessionIdPrefix);
//    checkTypes(prov);
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("It is not")
    } else {
        println("It is")
//        (infoProvider as SessionInfoProvider).getSessionId();
        infoProvider.getSessionId()
    }
}