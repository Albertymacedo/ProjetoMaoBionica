package Model;

public class Mao extends RepresentationHand implements IHands {

    public boolean Empurrar(IListener listener) {
        return listener.OnError();
    }

    public boolean Pegar(IListener listener) {
        return listener.OnError();
    }

    public boolean Apoiar(IListener listener) {
        return listener.OnError();
    }

    public boolean Soltar(IListener listener) {
        return listener.OnError();
    }

    public boolean Sentir(IListener listener) {
        return listener.OnError();
    }
}
