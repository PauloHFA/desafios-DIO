// Soma de Ímpares Consecutivos II

/*
Desafio:
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma
de todos os ímpares existentes entre X e Y (sem incluir X e Y).

Entrada:
A primeira linha de entrada é um inteiro N. Cada caso de teste consiste em uma
linha contendo dois inteiros X e Y.

Saída:
Imprima a soma de todos os valores ímpares entre X e Y.
*/

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosII {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();

            for (int i = 0; i < n; i++) {
                int x = leitor.nextInt();
                int y = leitor.nextInt();

                int min = Math.min(x, y);
                int max = Math.max(x, y);

                int soma = 0;
                for (int j = min + 1; j < max; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }

                System.out.println(soma);
            }
        }

        leitor.close();
    }
}
