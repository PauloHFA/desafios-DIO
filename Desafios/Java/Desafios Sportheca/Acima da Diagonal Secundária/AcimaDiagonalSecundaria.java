// Acima da Diagonal Secundária

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
considerando somente aqueles elementos que estão acima da diagonal secundária
da matriz, conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contém um único caractere Maiúsculo O ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonalSecundaria {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNext()) {
            char o = leitor.next().toUpperCase().charAt(0);
            double[][] m = new double[12][12];

            for (int i = 0; i < 12; ++i) {
                for (int j = 0; j < 12; ++j) {
                    m[i][j] = leitor.nextDouble();
                }
            }

            double soma = 0;
            int count = 0;
            for (int i = 0; i < 11; ++i) {
                for (int j = 0; j < 11 - i; ++j) {
                    soma += m[i][j];
                    count++;
                }
            }

            if (o == 'M') {
                soma /= count;
            }

            System.out.printf(Locale.US, "%.1f\n", soma);
        }
        leitor.close();
    }
}