package models

// - Version avec le constructeur primaire

//class Course(val name: String, var credit: Double, var desc: String? = null) {
//
//    fun getResume() = "$name - $credit credits"
//}


// - Version avec les propriétéees et le constructeur secondaire

class Course {

    // Déclaration de propriété en dehors du constructeur primaire
    val name: String
    var credit: Double
    var desc: String?

    // Utilisation du constructeur secondaire avec des parametres
    constructor(name: String, credit: Double) {
        this.name = name
        this.credit = credit
        this.desc = null
    }

    // Surchage du constructeur secondaire
    constructor(name: String, credit: Double, desc: String?) : this(name, credit) {
        this.desc = desc
    }

    // Méthode pour obtenir le resumé du cours
    fun getResume(): String {
        return "$name - $credit credits"
    }
}