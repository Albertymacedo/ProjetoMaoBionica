package data

interface IListener {
    fun onSuccess(): Boolean
    fun onFailure(): Boolean
}