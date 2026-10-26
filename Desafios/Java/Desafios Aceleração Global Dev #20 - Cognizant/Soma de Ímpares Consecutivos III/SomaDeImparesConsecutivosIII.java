// Soma de Ímpares Consecutivos III

/*
Desafio:
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma
de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar.

Por exemplo:
- Para a entrada 4 5, a saída deve ser 45 (5 + 7 + 9 + 11 + 13)
- Para a entrada 7 4, a saída deve ser 40 (7 + 9 + 11 + 13)

Entrada:
A primeira linha de entrada é um inteiro N. Cada caso de teste consiste em dois
inteiros X e Y.

Saída:
Imprima a soma dos consecutivos números ímpares a partir do valor X.
*/

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosIII {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();

            for (int i = 0; i < n; i++) {
                int x = leitor.nextInt();
                int y = leitor.nextInt();

                int primeiroImpar = (x % 2 != 0) ? x : x + 1;
                int soma = 0;

                for (int j = 0; j < y; j++) {
                    soma += primeiroImpar + (2 * j);
                }

                System.out.println(soma);
            }
        }

        leitor.close();
    }
}
