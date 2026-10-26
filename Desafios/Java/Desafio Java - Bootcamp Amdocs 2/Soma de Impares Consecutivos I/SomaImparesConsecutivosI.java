// Soma de Impares Consecutivos I

/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números
ímpares entre eles (sem incluir X e Y).

Entrada:
O arquivo de entrada contém dois valores inteiros.

Saída:
O programa deve imprimir um valor inteiro, correspondente à soma dos valores
ímpares que estão entre os valores fornecidos na entrada.
*/

import java.io.IOException;
import java.util.Scanner;

public class SomaImparesConsecutivosI {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int soma = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}
