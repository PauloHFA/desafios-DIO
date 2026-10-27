// Seis Números Ímpares

/*
Leia um valor inteiro X. Em seguida apresente os 6 valores
ímpares consecutivos a partir de X, um valor por linha,
inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Dado de entrada:
8
Saída esperada:
9
11
13
15
17
19
*/

import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int x = leitor.nextInt();
            int cont = 0;

            while (cont < 6) {
                if (x % 2 != 0) {
                    System.out.println(x);
                    cont++;
                }
                x++;
            }
        }
        leitor.close();
    }
}
