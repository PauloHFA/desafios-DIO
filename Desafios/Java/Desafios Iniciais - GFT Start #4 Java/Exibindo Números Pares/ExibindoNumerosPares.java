// Exibindo Números Pares

/*
Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.

- Entrada

Você receberá 1 valor inteiro N, onde N > 0.

- Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();
        if (entrada != null && !entrada.trim().isEmpty()) {
            int n = Integer.parseInt(entrada.trim());
            for (int i = 2; i <= n; i += 2) {
                System.out.println(i);
            }
        }
    }
}
