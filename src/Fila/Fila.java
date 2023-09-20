package Fila;

import Base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    public T espiar() {
        if(this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POS = 0;

        if(this.estaVazia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];

        this.remove(POS);

        return elementoASerRemovido;
    }
}
