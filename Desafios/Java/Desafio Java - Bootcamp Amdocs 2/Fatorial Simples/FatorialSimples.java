// Fatorial Simples

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial.
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada:
A entrada contém um valor inteiro N (0 < N < 13).

Saída:
A saída contém um valor inteiro, correspondente ao fatorial de N.
*/

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fatorial = 1;

        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
        scan.close();
    }
}
