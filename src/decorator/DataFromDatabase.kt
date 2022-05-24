package decorator

class DataFromDatabase: UserDao {
    override fun getUsers() {
        println("Data from database")
    }

    override fun saveUsers() {
        println("Users saved")
    }

    override fun getUser(id: Int) {
        println("Data from database")
    }
}