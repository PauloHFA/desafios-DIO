// Dividindo X por Y

/*
Escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
Caso não for possível, mostre a mensagem "divisao impossivel".

Entrada
A entrada contém um número inteiro N (quantidade de pares). Seguem os N pares X e Y.

Saída
Resultado com 1 dígito após o ponto decimal ou "divisao impossivel".
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                if (y == 0.0) {
                    System.out.println("divisao impossivel");
                } else {
                    System.out.printf(Locale.US, "%.1f\n", (x / y));
                }
            }
        }
        sc.close();
    }
}