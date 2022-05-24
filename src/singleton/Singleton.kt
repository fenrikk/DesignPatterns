package singleton

class Singleton private constructor() {
    private val list: MutableList<Int> = mutableListOf(10, 20, 30)

    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                synchronized(Singleton::class.java) {
                    if (instance == null) {
                        instance = Singleton()
                    }
                }
            }
            return instance!!
        }

    }

    fun addElement(element: Int) = list.add(element)

    fun getList(): List<Int> = list
}