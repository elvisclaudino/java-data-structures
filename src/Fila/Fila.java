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
}
