package builder

class Order private constructor(
    private var fries: Boolean?,
    private var bigMac: Boolean?,
    private var cola: Boolean?
) {

    override fun toString(): String {
        return "Order(fries=$fries, bigMac=$bigMac, cola=$cola)"
    }

    data class Builder(
        private var fries: Boolean? = null,
        private var bigMac: Boolean? = null,
        private var cola: Boolean? = null
    ) {
        fun fries(fries: Boolean) = apply { this.fries = fries }
        fun bigMac(bigMac: Boolean) = apply { this.bigMac = bigMac }
        fun cola(cola: Boolean) = apply { this.cola = cola }
        fun build() = Order(fries, bigMac, cola)
    }
}
