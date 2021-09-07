package data;

public interface IHands {
    boolean Empurrar(IListeners listener);
    boolean Pegar(IListeners listener);
    boolean Apoiar(IListeners listener);
    boolean Soltar(IListeners listener);
    boolean Sentir(IListeners listener);
}
