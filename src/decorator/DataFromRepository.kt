package decorator

class DataFromRepository(
    private val serverResponse: Boolean,
    private val dataFromBase: DataFromDatabase,
    private val dataFromServer: DataFromServer
) : UserRepository {

    override fun fetchUsers() {
        dataFromServer.fetchUsers()
    }

    override fun getUsers() {
        if (serverResponse) dataFromServer.fetchUsers()
        else dataFromBase.getUsers()
    }

    override fun saveUsers() {
        dataFromBase.saveUsers()
    }

    override fun getUser(id: Int) {
        dataFromBase.getUser(id)
    }
}