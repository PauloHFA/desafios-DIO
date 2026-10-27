// Experiências

/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        if (input.hasNextInt()) {
            int n = input.nextInt();
            int ratos = 0, coelhos = 0, sapos = 0;
            int total = 0;

            for (int i = 0; i < n; i++) {
                int quantia = input.nextInt();
                char tipo = input.next().toUpperCase().charAt(0);
                total += quantia;
                if (tipo == 'C') {
                    coelhos += quantia;
                } else if (tipo == 'R') {
                    ratos += quantia;
                } else if (tipo == 'S') {
                    sapos += quantia;
                }
            }

            double pC = total > 0 ? (coelhos * 100.0) / total : 0.0;
            double pR = total > 0 ? (ratos * 100.0) / total : 0.0;
            double pS = total > 0 ? (sapos * 100.0) / total : 0.0;

            System.out.printf(Locale.US, "Total: %d cobaias\n", total);
            System.out.printf(Locale.US, "Total de coelhos: %d\n", coelhos);
            System.out.printf(Locale.US, "Total de ratos: %d\n", ratos);
            System.out.printf(Locale.US, "Total de sapos: %d\n", sapos);
            System.out.printf(Locale.US, "Percentual de coelhos: %.2f %%\n", pC);
            System.out.printf(Locale.US, "Percentual de ratos: %.2f %%\n", pR);
            System.out.printf(Locale.US, "Percentual de sapos: %.2f %%\n", pS);
        }

        input.close();
    }
}
