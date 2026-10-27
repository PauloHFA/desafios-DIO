// Xadrez

/*
No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca.
Queremos saber a cor da casa na linha L, coluna C (1 para branca e 0 para preta).

Entrada
A primeira linha contém um inteiro L. A segunda linha contém um inteiro C.

Saída
Imprima uma linha com o inteiro 1 se a casa for branca ou 0 se for preta.
*/

import java.io.IOException;
import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int l = leitor.nextInt();
            int c = leitor.nextInt();
            if ((l + c) % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        leitor.close();
    }
}