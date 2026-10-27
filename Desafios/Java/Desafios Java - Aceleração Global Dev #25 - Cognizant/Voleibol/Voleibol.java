// Voleibol

/*
Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.

Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.

Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Voleibol {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextInt()) {
            int N = leitor.nextInt();

            int saques = 0, bloqueios = 0, ataques = 0;
            int s1 = 0, b1 = 0, a1 = 0;

            for (int i = 0; i < N; i++) {
                String name = leitor.next();

                saques += leitor.nextInt();
                bloqueios += leitor.nextInt();
                ataques += leitor.nextInt();

                s1 += leitor.nextInt();
                b1 += leitor.nextInt();
                a1 += leitor.nextInt();
            }

            double pS = saques > 0 ? (100.0 * s1) / saques : 0.0;
            double pB = bloqueios > 0 ? (100.0 * b1) / bloqueios : 0.0;
            double pA = ataques > 0 ? (100.0 * a1) / ataques : 0.0;

            System.out.printf(Locale.US, "Pontos de Saque: %.2f %%.\n", pS);
            System.out.printf(Locale.US, "Pontos de Bloqueio: %.2f %%.\n", pB);
            System.out.printf(Locale.US, "Pontos de Ataque: %.2f %%.\n", pA);
        }

        leitor.close();
    }
}
