import singleton.Singleton

fun main(args: Array<String>) {
//    val phone = Phone("Samsung")
//    val electricityFromSocket = ElectricityFromSocket(16, 220)
//    val powerAdapter = PowerAdapter()
//    phone.charge(powerAdapter.adapt(electricityFromSocket))

//    val order = Order.Builder().bigMac(true).cola(true)
//    println(order.toString())

//    val pencils = mutableListOf<Pencil>()
//    val pencilFactory = PencilFactory()
//    pencils.add(pencilFactory.createDefaultPencil())
//    pencils.add(pencilFactory.createPencilToWrite(150))
//    pencils.add(pencilFactory.createPencilToDraw(200, Color.RED))

//    val repository = DataFromRepository(true, DataFromDatabase(), DataFromServer())
//    repository.getUsers()

    println(Singleton.getInstance().getList())
    Singleton.getInstance().addElement(10)
    Singleton.getInstance().addElement(20)
    Singleton.getInstance().addElement(30)
    println(Singleton.getInstance().getList())
}