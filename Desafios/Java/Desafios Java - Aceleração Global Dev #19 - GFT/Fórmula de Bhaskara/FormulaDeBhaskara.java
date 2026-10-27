// Fórmula de Bhaskara

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextDouble()) {
            double a = leitor.nextDouble();
            double b = leitor.nextDouble();
            double c = leitor.nextDouble();

            double delta = (b * b) - (4 * a * c);

            if (delta < 0 || a == 0) {
                System.out.println("Impossivel calcular");
            } else {
                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                double r2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf(Locale.US, "R1 = %.5f\n", r1);
                System.out.printf(Locale.US, "R2 = %.5f\n", r2);
            }
        }

        leitor.close();
    }
}
