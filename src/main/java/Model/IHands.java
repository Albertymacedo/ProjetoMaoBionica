package Model;

public interface IHands {
    boolean Empurrar(IListener listener);
    boolean Pegar(IListener listener);
    boolean Apoiar(IListener listener);
    boolean Soltar(IListener listener);
    boolean Sentir(IListener listener);
}
