package Vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elements;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elements = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adiciona(String elemento) {
//        for(int i=0; i<this.elements.length; i++) {
//            if(this.elements[i] == null) {
//                this.elements[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//        if(this.tamanho < this.elements.length) {
//            this.elements[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos");
//        }
//    }

    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[posicao];
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1; i++) {
            s.append(elements[i]);
            s.append(", ");
        }

        if(this.tamanho>0) {
            s.append(this.elements[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
