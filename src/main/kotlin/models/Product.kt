package models

import enums.TvaEnum

class Product(val name: String, val priceHT: Double, val tva: TvaEnum) {

    val priceTTC
        get() = tva.getFullPrice(priceHT)

    val taxApplied
        get() = tva.getTax(priceHT)

    override fun toString(): String {
        return "$name (HT: $priceHT | TTC: $priceTTC)"
    }
}


fun main() {

    val p1: Product = Product("Pomme", 2.0, TvaEnum.REDUCE)
    println(p1)

    val p2: Product = Product("Table", 199.99, TvaEnum.NORMAL)
    println(p2)

}