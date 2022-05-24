package adapter

class Phone(
    val name: String
) {
    fun charge(electricityToCharge: ElectricityToCharge){
        print("Charging with ${electricityToCharge.voltage}V ${electricityToCharge.strength}A")
    }
}