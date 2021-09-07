package model

import data.IHand
import data.IListener

/** TODO
 *      Tá dando Erro Porque AbstractHand
 *      ta vazio apartir desse commit.
 * **/

class Hand: AbstractHand, IHand {
    override fun Empurrar(listener: IListener?): Boolean {
        return false
    }

    override fun Pegar(listener: IListener?): Boolean {
        return false
    }

    override fun Apoiar(listener: IListener?): Boolean {
        return false
    }

    override fun Soltar(listener: IListener?): Boolean {
        return false
    }
}