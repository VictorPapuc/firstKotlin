package src.begginer.objects

import java.util.*


enum class EntityType {
    EASY, MEDIUM, HARD;
    fun getFormattedName() = name.toLowerCase().capitalize()
}


object EntityFactory {
    fun create(type: EntityType): EntityId {
        val id = UUID.randomUUID().toString()
        val name = when (type) {

            EntityType.EASY -> "Easy"
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
        }
        return EntityId(id, name)
    }
}


class EntityId(val id: String, val name: String) {

    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
    val HardEntity = EntityFactory.create(EntityType.HARD)
}
