package singleton

object Singleton {
    private val list: MutableList<Int> = mutableListOf(10, 20, 30)

    fun addElement(element: Int) = list.add(element)

    fun getList(): List<Int> = list
}
