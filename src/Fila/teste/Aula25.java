package Fila.teste;

import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new java.util.PriorityQueue<Integer>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade); // 1, 2 e 3 e não 1, 3 e 2
    }
}
