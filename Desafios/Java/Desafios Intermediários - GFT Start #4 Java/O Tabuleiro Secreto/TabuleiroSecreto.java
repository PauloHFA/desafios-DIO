// O tabuleiro secreto

/*
O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo. 
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.

O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas, podendo ser de 4 tipos:
•	1 X R: Atribuir o valor R a todos os números da linha X;
•	2 X R: Atribuir o valor R a todos os números da coluna X;
•	3 X: Imprimir o valor mais frequente na linha X;
•	4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores programadores do mundo, ele precisa de sua ajuda para resolver este problema.

Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 10^5), representando, respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        if (linha == null || linha.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(linha);
        int tamTab = Integer.parseInt(st.nextToken());
        int numOp = Integer.parseInt(st.nextToken());

        int[][] matriz = new int[tamTab][tamTab];

        for (int i = 0; i < numOp; i++) {
            String opLinha = br.readLine();
            if (opLinha == null) break;
            st = new StringTokenizer(opLinha);
            if (!st.hasMoreTokens()) continue;

            int tipoOp = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            if (tipoOp == 1) {
                int r = Integer.parseInt(st.nextToken());
                for (int j = 0; j < tamTab; j++) {
                    matriz[x - 1][j] = r;
                }
            } else if (tipoOp == 2) {
                int r = Integer.parseInt(st.nextToken());
                for (int j = 0; j < tamTab; j++) {
                    matriz[j][x - 1] = r;
                }
            } else if (tipoOp == 3) {
                imprimirMaisFrequenteLinha(matriz, x - 1, tamTab);
            } else if (tipoOp == 4) {
                imprimirMaisFrequenteColuna(matriz, x - 1, tamTab);
            }
        }
    }

    private static void imprimirMaisFrequenteLinha(int[][] matriz, int linha, int tam) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int j = 0; j < tam; j++) {
            int val = matriz[linha][j];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        imprimirResultado(freq);
    }

    private static void imprimirMaisFrequenteColuna(int[][] matriz, int col, int tam) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < tam; i++) {
            int val = matriz[i][col];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        imprimirResultado(freq);
    }

    private static void imprimirResultado(Map<Integer, Integer> freq) {
        int melhorVal = -1;
        int maiorFreq = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int val = entry.getKey();
            int f = entry.getValue();

            if (f > maiorFreq || (f == maiorFreq && val > melhorVal)) {
                maiorFreq = f;
                melhorVal = val;
            }
        }

        System.out.println(melhorVal);
    }
}
