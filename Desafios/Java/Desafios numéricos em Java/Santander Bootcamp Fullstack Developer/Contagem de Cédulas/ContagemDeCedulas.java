// Contagem de Cédulas

/*
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
*/

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int notasInseridas = leitor.nextInt();
            int atual = notasInseridas;

            int notas100 = atual / 100;
            atual %= 100;
            int notas50 = atual / 50;
            atual %= 50;
            int notas20 = atual / 20;
            atual %= 20;
            int notas10 = atual / 10;
            atual %= 10;
            int notas5 = atual / 5;
            atual %= 5;
            int notas2 = atual / 2;
            atual %= 2;
            int notas1 = atual;

            System.out.println(notasInseridas);
            System.out.println(notas100 + " nota(s) de R$ 100,00");
            System.out.println(notas50 + " nota(s) de R$ 50,00");
            System.out.println(notas20 + " nota(s) de R$ 20,00");
            System.out.println(notas10 + " nota(s) de R$ 10,00");
            System.out.println(notas5 + " nota(s) de R$ 5,00");
            System.out.println(notas2 + " nota(s) de R$ 2,00");
            System.out.println(notas1 + " nota(s) de R$ 1,00");
        }
        leitor.close();
    }
}
