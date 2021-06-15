package models

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Student(firstname: String, lastname: String, bithdate: LocalDate, email: String? = null) :
    Person(firstname, lastname, bithdate, email) {

    val matricule: String
        get() {
            val valFirstname = this.firstname.take(2)
            val valLastname = this.lastname.take(2)
            val valBirthdate = this.birthdate.format(DateTimeFormatter.ofPattern("YYMMdd"))
            return (valFirstname + valLastname + valBirthdate).lowercase()
        }

    fun study(course: Course) {
        println("$fullname etudie le cours de ${course.name}")
    }

    fun attendCourse(course: Course) {
        println("$fullname assite au cours de ${course.name}")
    }

    fun sendEmail(teacher: Teacher, subject: String) {
        println("$fullname envoit un courriel")
        teacher.receiveEmail(this, subject)
    }

    fun guindailler() {
        println("$firstname $lastname guindaille !")
    }

    // Re-définition d'une méthode via le mot clef "override"
    //  -> Necessite que la méthode soit "open"
    override fun sleep(nbHour: Int) {
        val goGuindaille: Boolean = (0 until 3).random() == 0

        val nbSleepHour = if (goGuindaille) {
            guindailler()
            (0 until nbHour).random() // Valeur quand il guindaille
        } else {
             nbHour                   // Valeur par defaut
        }

        super.sleep(nbSleepHour)
    }
}