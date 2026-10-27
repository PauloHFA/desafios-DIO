// Exibindo Números Pares

/*
Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int entrada = sc.nextInt();
            for (int i = 2; i <= entrada; i += 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}