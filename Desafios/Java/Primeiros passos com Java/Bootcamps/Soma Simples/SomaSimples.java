// Soma Simples

/*
Leia dois valores inteiros A e B. Calcule a soma entre eles (SOMA).

Entrada
2 valores inteiros.

Saída
"SOMA = X".
*/

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("SOMA = " + (a + b));
        }
        sc.close();
    }
}