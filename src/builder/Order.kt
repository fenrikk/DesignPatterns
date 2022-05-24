package builder

class Order private constructor(
    private var fries: Boolean?,
    private var bigMac: Boolean?,
    private var cola: Boolean?
) {

    override fun toString(): String {
        return "Order(fries=$fries, bigMac=$bigMac, cola=$cola)"
    }

    class Builder {
        private var fries: Boolean? = null
        private var bigMac: Boolean? = null
        private var cola: Boolean? = null

        fun fries(fries: Boolean): Builder = apply { this.fries = fries }
        fun bigMac(bigMac: Boolean): Builder = apply { this.bigMac = bigMac }
        fun cola(cola: Boolean): Builder = apply { this.cola = cola }
        fun build() = Order(fries, bigMac, cola)
    }
}
