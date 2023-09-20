package Fila.teste;

import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new java.util.LinkedList<Integer>();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek()); // espiar

        System.out.println(fila.remove());

        System.out.println(fila);
    }
}
