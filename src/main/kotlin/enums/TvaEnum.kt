package enums

enum class TvaEnum(val taux: Int) {
    NORMAL(21),
    REDUCE(6),
    PARKING(12);

    fun getTax(amount: Double): Double {
        return (amount * this.taux) / 100
    }

    fun getFullPrice(amount:Double): Double {
        return amount + this.getTax(amount);
    }
}


//fun main() {
//
//    val priceHT: Double = 42.0
//    val tva: TvaEnum = TvaEnum.NORMAL
//    val priceTTC = tva.getFullPrice(priceHT)
//}