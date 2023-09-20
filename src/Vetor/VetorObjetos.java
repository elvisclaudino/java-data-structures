package Vetor;

public class VetorObjetos {
    private Object[] elements;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elements = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade();

        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Object elemento) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // Mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--) {
            this.elements[i+1] = this.elements[i];
        }
        this.elements[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elements.length) {
            Object[] elementsNovos = new Object[this.elements.length * 2];
            for(int i=0; i<this.elements.length; i++) {
                elementsNovos[i] = this.elements[i];
            }
            this.elements = elementsNovos;
        }
    }

    public Object busca(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[posicao];
    }

    public int busca (Object elemento) {
        for(int i=0; i<this.tamanho; i++) {
            if(this.elements[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao; i<this.tamanho-1; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.tamanho--;
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
