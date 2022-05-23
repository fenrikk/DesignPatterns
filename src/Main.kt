import adapter.ElectricityFromSocket
import adapter.Phone
import adapter.PowerAdapter
import builder.Order
import decorator.BubbleLights
import decorator.Garland
import decorator.PineChristmasTree
import factory.Pencil
import factory.PencilFactory
import java.awt.Color

fun main(args: Array<String>) {
//    println(singleton.Singleton.getList())
//    singleton.Singleton.addElement(10)
//    singleton.Singleton.addElement(20)
//    singleton.Singleton.addElement(30)
//    println(singleton.Singleton.getList())

//    val phone = Phone("Samsung")
//    val electricityFromSocket = ElectricityFromSocket("AC", 220)
//    val powerAdapter = PowerAdapter(electricityFromSocket)
//    phone.charge(powerAdapter)

//    val order = Order.Builder().bigMac(true).cola(true)
//    println(order.toString())

//    val pencils = mutableListOf<Pencil>()
//    val pencilFactory = PencilFactory()
//    pencils.add(pencilFactory.createDefaultPencil())
//    pencils.add(pencilFactory.createPencilToWrite(150))
//    pencils.add(pencilFactory.createPencilToDraw(200, Color.RED))

    val christmasTree = Garland(PineChristmasTree())

    val decoratedChristmasTree = christmasTree.decorate()
    println(decoratedChristmasTree)
}