// Fatorial Simples

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

Exemplo de Entrada	
4
Exemplo de Saída
24
*/

import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
        scan.close();
    }
}
