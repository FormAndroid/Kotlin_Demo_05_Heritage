package models

import java.time.LocalDate
import java.time.Period

open class Person(val firstname: String, val lastname: String, val birthdate: LocalDate, email: String?) {

    val fullname: String
        get() = "$firstname $lastname"

    val age: Int
        get() {
            val period: Period = Period.between(birthdate, LocalDate.now())
            return period.years
        }

    var email: String? = null // Rappel : l'affectation avec une valeur par default n'utilise pas le setter
        set(value) {
            if (value != null && !Regex("^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\$").matches(value)) {
                throw Throwable("Bad E-mail !")
            }
            field = value
        }

    init {
        // Affection de l'email via son setter
        this.email = email
    }

    fun eat(food: String) {
        println("$fullname mange $food")
    }

    fun sleep(nbHour: Int = 8) {
        if (nbHour == 0) {
            println("$fullname a fait une nuit blanche!")
        } else {
            println("$fullname dort $nbHour heures.")
        }
    }
}