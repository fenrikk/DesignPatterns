import builder.Order
import decorator.DataFromDatabase
import decorator.DataFromRepository
import decorator.DataFromServer

fun main(args: Array<String>) {
//    println(singleton.Singleton.getList())
//    singleton.Singleton.addElement(10)
//    singleton.Singleton.addElement(20)
//    singleton.Singleton.addElement(30)
//    println(singleton.Singleton.getList())

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

    val repository = DataFromRepository(true, DataFromDatabase(), DataFromServer())
    repository.getUsers()
}