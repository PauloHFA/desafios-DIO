// Quadrado e ao Cubo

/*
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000).
Este N é a quantidade de linhas de saída que serão apresentadas.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo: i, i^2, i^3.
*/

import java.io.IOException;
import java.util.Scanner;

public class QuadradoEAoCubo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " " + (i * i) + " " + (i * i * i));
            }
        }
        leitor.close();
    }
}