// De Quem é a Vez?

/*
Desafio
O jogo PAR ou ÍMPAR vem decidindo o destino de pessoas ao longo de décadas. As regras são simples: dois jogadores informam um número e se a soma desses números for par o jogador que escolheu PAR ganha e vice-versa. Em um jogo que as crianças do bairro estão jogando, eles não conseguem decidir quem será o próximo a escolher as regras da brincadeira. Para solucionar esse problema, você foi chamado.
Basicamente a brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador uma das crianças pediu sua ajuda para desenvolver um programa que, dado o nome dos jogadores, suas respectivas escolhas PAR ou IMPAR e os números, informe quem foi o vencedor.

Entrada
A primeira linha de entrada contém um número inteiro QT (1 <= QT <= 100), indicando a quantidade de casos de teste que vem a seguir. Cada caso de teste contém duas linhas. Na primeira linha será informado o nome do jogador 1 seguido de sua escolha, "PAR" ou "IMPAR" e logo após, o nome do jogador 2 seguido de sua escolha, "PAR" ou "IMPAR". Na segunda linha de entrada, contém 2 números inteiros N (1 <= N <= 10^9) e M (1 <= M <= 10^9), representando respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2.

Saída
Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.
*/

import java.io.IOException;
import java.util.Scanner;

public class DeQuemEAVez {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int qt = Integer.parseInt(leitor.nextLine().trim());
            for (int i = 0; i < qt; i++) {
                String[] linha1 = leitor.nextLine().trim().split("\\s+");
                String[] linha2 = leitor.nextLine().trim().split("\\s+");

                String nome1 = linha1[0];
                String escolha1 = linha1[1];
                String nome2 = linha1[2];

                long n = Long.parseLong(linha2[0]);
                long m = Long.parseLong(linha2[1]);

                long soma = n + m;
                boolean somaEhPar = (soma % 2 == 0);

                if ((somaEhPar && escolha1.equalsIgnoreCase("PAR")) ||
                    (!somaEhPar && escolha1.equalsIgnoreCase("IMPAR"))) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            }
        }
        leitor.close();
    }
}