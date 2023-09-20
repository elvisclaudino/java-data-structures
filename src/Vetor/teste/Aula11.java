package Vetor.teste;

import Vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<Contato>(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "email1@email.com");
        Contato c2 = new Contato("Contato 2", "1234-5323", "email2@email.com");
        Contato c3 = new Contato("Contato 3", "1234-1213", "email3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        System.out.println(vetor);
    }
}
