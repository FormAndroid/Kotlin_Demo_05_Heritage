package interfaces

interface IShape {
    val thickness: Int
    var color: String

    fun draw()
}

// Implementation de l'interface et avec constructeur secondaire
class Square : IShape {
    override val thickness: Int
    override var color: String

    constructor(thickness:Int, color: String) {
        this.thickness = thickness
        this.color = color
    }

    override fun draw() {
        println("Un carré $color")
    }
}

// Implementation de l'interface et avec constructeur primaire
class Circle(override val thickness: Int, override var color: String) : IShape {

    override fun draw() {
        println("Un cercle $color")
    }
}