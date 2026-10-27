// Quantidade de Números Positivos

/*
Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos.
Apresente a quantidade de valores positivos digitados.

Entrada
6 valores.

Saída
"X valores positivos".
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (sc.hasNextDouble()) {
                if (sc.nextDouble() > 0) {
                    count++;
                }
            }
        }
        System.out.println(count + " valores positivos");
        sc.close();
    }
}