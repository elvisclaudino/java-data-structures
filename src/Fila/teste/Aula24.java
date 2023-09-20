package Fila.teste;

import Fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);

        System.out.println(fila); // 1, 2 e 3 e não 1, 3 e 2
    }
}
