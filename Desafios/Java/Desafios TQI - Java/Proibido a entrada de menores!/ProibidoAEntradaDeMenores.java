// Proibido a entrada de menores!

/*
Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, a idade de N pessoas. Depois disso, coloque a idade mínima permitida para se entrar no local, conforme exemplo.

Retorne às idades de quem não puder entrar.
*/

import java.io.IOException;
import java.util.Scanner;

public class ProibidoAEntradaDeMenores {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            int[] idade = new int[n];

            for (int i = 0; i < n; i++) {
                idade[i] = scan.nextInt();
            }

            System.out.println("Nao poderao entrar as idades: ");
            for (int i = 0; i < n; i++) {
                if (idade[i] < 18) {
                    System.out.println(idade[i]);
                }
            }
        }
        scan.close();
    }
}