package adapter

open class ElectricityToCharge(
    private val _type: String,
    private val _voltage: Int
) {
    val type: String = _type
    val voltage: Int = _voltage
}