package model

import data.IHand
import data.IListener
import java.lang.IllegalArgumentException

class Hand(
    fingers: Int,
    material: HandTypes): AbstractHand(fingers, material), IHand {

    override fun Empurrar(listener: IListener?): Boolean {
        if(listener == null) return false
        if(listener.onSuccess()) return true
        if(listener.onFailure()) return false
        throw IllegalArgumentException("Evento desconhecido.")
    }

    override fun Pegar(listener: IListener?): Boolean {
        if(listener == null) return false
        if(listener.onSuccess()) return true
        if(listener.onFailure()) return false
        throw IllegalArgumentException("Evento desconhecido.")
    }

    override fun Apoiar(listener: IListener?): Boolean {
        if(listener == null) return false
        if(listener.onSuccess()) return true
        if(listener.onFailure()) return false
        throw IllegalArgumentException("Evento desconhecido.")
    }

    override fun Soltar(listener: IListener?): Boolean {
        if(listener == null) return false
        if(listener.onSuccess()) return true
        if(listener.onFailure()) return false
        throw IllegalArgumentException("Evento desconhecido.")
    }
}