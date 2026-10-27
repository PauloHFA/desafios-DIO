// Preenchimento de Vetor III

/*
Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior.

Entrada
Um valor de ponto flutuante com 4 casas decimais.

Saída
N[i] = Y, com 4 casas decimais.
*/

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetorIII {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextDouble()) {
            double x = leitor.nextDouble();
            BigDecimal atual = BigDecimal.valueOf(x);
            BigDecimal dois = BigDecimal.valueOf(2);

            for (int i = 0; i < 100; i++) {
                System.out.printf(Locale.US, "N[%d] = %.4f\n", i, atual.doubleValue());
                atual = atual.divide(dois);
            }
        }
        leitor.close();
    }
}