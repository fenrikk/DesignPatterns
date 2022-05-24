package adapter

class PowerAdapter() {
    fun adapt(electricityFromSocket: ElectricityFromSocket): ElectricityToCharge {
        val strength = electricityFromSocket.strength - 14
        val voltage = electricityFromSocket.voltage - 208
        return ElectricityToCharge(strength, voltage)
    }
}
