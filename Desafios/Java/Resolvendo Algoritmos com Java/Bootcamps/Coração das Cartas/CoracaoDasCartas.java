// Coração das Cartas

/*
Três pilhas de cartas. Em cada rodada pode-se retirar 1, 2 ou 3 cartas (no máximo 1 de cada pilha)
se a soma dos valores for múltiplo de 3.
Verificar se é possível esvaziar todas as pilhas.

Entrada
Vários casos de teste com N (tamanho das pilhas). Termina com N = 0.

Saída
1 se for possível esvaziar, 0 caso contrário.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CoracaoDasCartas {
    static int n;
    static int[] p1, p2, p3;
    static Boolean[][][] memo;

    static boolean podeGanhar(int a, int b, int c) {
        if (a == n && b == n && c == n) return true;
        if (memo[a][b][c] != null) return memo[a][b][c];

        boolean win = false;

        // 1 carta de uma pilha
        if (a < n && p1[a] % 3 == 0 && podeGanhar(a + 1, b, c)) win = true;
        else if (b < n && p2[b] % 3 == 0 && podeGanhar(a, b + 1, c)) win = true;
        else if (c < n && p3[c] % 3 == 0 && podeGanhar(a, b, c + 1)) win = true;

        // 2 cartas de pilhas distintas
        else if (a < n && b < n && (p1[a] + p2[b]) % 3 == 0 && podeGanhar(a + 1, b + 1, c)) win = true;
        else if (a < n && c < n && (p1[a] + p3[c]) % 3 == 0 && podeGanhar(a + 1, b, c + 1)) win = true;
        else if (b < n && c < n && (p2[b] + p3[c]) % 3 == 0 && podeGanhar(a, b + 1, c + 1)) win = true;

        // 3 cartas (1 de cada pilha)
        else if (a < n && b < n && c < n && (p1[a] + p2[b] + p3[c]) % 3 == 0 && podeGanhar(a + 1, b + 1, c + 1)) win = true;

        return memo[a][b][c] = win;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            n = Integer.parseInt(line);
            if (n == 0) break;

            p1 = new int[n];
            p2 = new int[n];
            p3 = new int[n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                p1[i] = Integer.parseInt(st.nextToken());
                p2[i] = Integer.parseInt(st.nextToken());
                p3[i] = Integer.parseInt(st.nextToken());
            }

            memo = new Boolean[n + 1][n + 1][n + 1];
            System.out.println(podeGanhar(0, 0, 0) ? 1 : 0);
        }
    }
}