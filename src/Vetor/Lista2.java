package Vetor;

import Base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {
    public Lista2() {
        super();
    }
    public Lista2(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return adiciona(posicao, elemento);
    }
}
