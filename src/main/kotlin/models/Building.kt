package models

abstract class Building(val nbRoom: Int, val nbFloor: Int, val area: Double)

open class Shop(nbRoom: Int, nbFloor: Int, area: Double, val speciality: String) :
        Building(nbRoom, nbFloor, area)

open class House(nbRoom: Int, nbFloor: Int, area: Double, val typeHouse: TypeHouse)



// Création d'une enumeration
enum class TypeHouse {
    SINGLE_FAMILY,
    CASTLE,
    VILLA,
    CHALET,
    TREE_HOUSE;
}

fun main() {

    val h1: House = House(5, 3, 70.0, TypeHouse.SINGLE_FAMILY)
    val h2: House = House(20, 5, 299.9, TypeHouse.CASTLE)

}