// O Tabuleiro Secreto

/*
Operações em uma matriz N x N inicializada com 0:
1 X R: atribuir R a toda linha X
2 X R: atribuir R a toda coluna X
3 X: imprimir o valor mais frequente na linha X (desempate: maior valor)
4 X: imprimir o valor mais frequente na coluna X (desempate: maior valor)

Entrada
N e Q. Seguem as Q operações.

Saída
Resultado de cada operação 3 e 4.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class OTabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaInicial = br.readLine();
        if (linhaInicial == null || linhaInicial.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(linhaInicial);
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] matriz = new int[n][n];

        for (int k = 0; k < q; k++) {
            st = new StringTokenizer(br.readLine());
            int tipo = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;

            if (tipo == 1) {
                int r = Integer.parseInt(st.nextToken());
                for (int j = 0; j < n; j++) {
                    matriz[x][j] = r;
                }
            } else if (tipo == 2) {
                int r = Integer.parseInt(st.nextToken());
                for (int i = 0; i < n; i++) {
                    matriz[i][x] = r;
                }
            } else if (tipo == 3) {
                Map<Integer, Integer> freq = new HashMap<>();
                for (int j = 0; j < n; j++) {
                    freq.put(matriz[x][j], freq.getOrDefault(matriz[x][j], 0) + 1);
                }
                int maisFrequente = getMaisFrequente(freq);
                System.out.println(maisFrequente);
            } else if (tipo == 4) {
                Map<Integer, Integer> freq = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    freq.put(matriz[i][x], freq.getOrDefault(matriz[i][x], 0) + 1);
                }
                int maisFrequente = getMaisFrequente(freq);
                System.out.println(maisFrequente);
            }
        }
    }

    private static int getMaisFrequente(Map<Integer, Integer> freq) {
        int melhorValor = -1;
        int maiorFreq = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int val = entry.getKey();
            int f = entry.getValue();

            if (f > maiorFreq || (f == maiorFreq && val > melhorValor)) {
                maiorFreq = f;
                melhorValor = val;
            }
        }
        return melhorValor;
    }
}