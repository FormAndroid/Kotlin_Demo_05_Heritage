fun main(args: Array<String>) {
    val d = Demo("Hello World")
    println("L'instance de \"Demo\" est de type Any: ${d is Any}")


}


// Une classe hérite implicitement de la classe "Any"
// Cela défini 3 méthodes -> equals, hascode, toString
class Demo(val name: String)



// En Kotlin, par defaut le mecanisme de l'heritage est "verouillé"
// Pour l'autorisé, il est necessaire d'utiliser le mot clef "open"
open class ClasseDeBase(val name: String)

// Pour hérité d'une classe, il faut utiliser le symbole ":"
class ClasseDerive(name:String, val number: Int) : ClasseDeBase(name)

