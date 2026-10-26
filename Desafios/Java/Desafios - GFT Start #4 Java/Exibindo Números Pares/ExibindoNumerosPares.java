// Exibindo Números Pares

/*
Desafio:
Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.

Entrada:
Você receberá 1 valor inteiro N, onde N > 0.

Saída:
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        
        scan.close();
    }
}
