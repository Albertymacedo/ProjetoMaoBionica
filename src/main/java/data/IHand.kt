package data

interface IHand {
    fun Empurrar(listener: IListener?): Boolean
    fun Pegar(listener: IListener?): Boolean
    fun Apoiar(listener: IListener?): Boolean
    fun Soltar(listener: IListener?): Boolean
}