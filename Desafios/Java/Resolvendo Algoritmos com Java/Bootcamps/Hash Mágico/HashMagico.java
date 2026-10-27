// Hash Mágico

/*
O conceito de hash é transformar uma grande quantidade de dados em uma pequena quantidade de informações.
O valor de hash é a soma dos valores de cada caractere:
Posição no alfabeto (0 a 25) + Elemento de entrada (0 a L-1) + Posição do caractere (0 a len-1).

Entrada
Quantidade de casos de teste N. Cada caso contém L (número de linhas) seguido das L linhas.

Saída
O valor de hash resultante.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HashMagico {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaN = br.readLine();
        if (linhaN != null && !linhaN.trim().isEmpty()) {
            int n = Integer.parseInt(linhaN.trim());
            for (int t = 0; t < n; t++) {
                int l = Integer.parseInt(br.readLine().trim());
                long hash = 0;

                for (int elemento = 0; elemento < l; elemento++) {
                    String str = br.readLine();
                    for (int pos = 0; pos < str.length(); pos++) {
                        char c = str.charAt(pos);
                        int posAlfabeto = c - 'A';
                        hash += posAlfabeto + elemento + pos;
                    }
                }
                System.out.println(hash);
            }
        }
    }
}