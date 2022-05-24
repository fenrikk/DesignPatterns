package decorator

interface UserDao {
    fun getUsers()
    fun saveUsers()
    fun getUser(id: Int)
}