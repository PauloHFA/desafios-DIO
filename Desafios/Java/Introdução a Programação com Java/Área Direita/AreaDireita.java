// Área Direita

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz.

Entrada
A primeira linha de entrada contém um único caractere Maiúsculo O ('S' ou 'M'). Seguem os 144 valores de ponto flutuante.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AreaDireita {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNext()) {
            char o = leitor.next().toUpperCase().charAt(0);
            double[][] m = new double[12][12];

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    m[i][j] = leitor.nextDouble();
                }
            }

            double soma = 0;
            int count = 0;
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if ((i < 6 && j > 11 - i) || (i >= 6 && j > i)) {
                        soma += m[i][j];
                        count++;
                    }
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