package adapter

class Phone(
    val name: String
) {
    fun charge(electricityToCharge: ElectricityToCharge) = print("Charging")
}