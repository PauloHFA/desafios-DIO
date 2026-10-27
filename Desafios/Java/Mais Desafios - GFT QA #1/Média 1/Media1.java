// Média 1

/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a
2 notas de um aluno. A seguir, calcule a média do aluno (pesos 3.5 e 7.5).

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA com 5 dígitos após o ponto decimal.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double media = ((a * 3.5) + (b * 7.5)) / 11.0;
            System.out.printf(Locale.US, "MEDIA = %.5f\n", media);
        }
        sc.close();
    }
}