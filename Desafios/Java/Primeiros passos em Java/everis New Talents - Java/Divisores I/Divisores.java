// Divisores I

/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
Um valor inteiro N.

Saída
Todos os divisores positivos de N, um por linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
        leitor.close();
    }
}