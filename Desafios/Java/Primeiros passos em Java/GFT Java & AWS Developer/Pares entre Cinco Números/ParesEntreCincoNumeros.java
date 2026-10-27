// Pares entre Cinco Números

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares.

Entrada
5 valores inteiros.

Saída
"X valores pares".
*/

import java.io.IOException;
import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                if (n % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count + " valores pares");
        scan.close();
    }
}