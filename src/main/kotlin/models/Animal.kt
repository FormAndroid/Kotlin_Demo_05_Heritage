package models

abstract class Animal(val name: String, val age: Int) {

    // Définition d'un comportement abstrait
    abstract fun cry(): String
}


class Cat(name: String, age: Int, hasLongHaired: Boolean) : Animal(name, age) {

    override fun cry(): String {
        return "Miaou !"
    }
}

