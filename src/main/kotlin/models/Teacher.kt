package models

import java.time.LocalDate

class Teacher(firstname: String, lastname: String, bithdate: LocalDate, email: String, var favoriteCourse: Course) :
    Person(firstname, lastname, bithdate, email) {

    // Re-définition d'une propriété
    //  -> Necessite que l'element soit "open" dans la classe parent
    override val fullname: String
        get() = "Prof $lastname"

    fun teach(course: Course) {
        println("$fullname donne cours de ${course.name}")
    }

    fun correct() {
        println("$fullname corrige des copies")
    }

    fun receiveEmail(student: Student, subject: String){
        println("$fullname recoit un email ($subject) de ${student.fullname}")
    }
}