package decorator

class DataFromServer: UserApi {
    override fun fetchUsers() {
        println("Data from server")
    }
}