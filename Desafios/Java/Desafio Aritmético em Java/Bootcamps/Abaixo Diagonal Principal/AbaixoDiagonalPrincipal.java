// Abaixo da Diagonal Principal

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
considerando somente aqueles elementos que estão abaixo da diagonal principal
da matriz, conforme ilustrado abaixo (área verde).

Entrada:
A primeira linha de entrada contém um único caractere Maiúsculo O ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída:
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
decimal.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDiagonalPrincipal {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        char operacao = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        double soma = 0.0;
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        
        // Elementos estritamente abaixo da diagonal principal (i > j)
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                soma += M[i][j];
            }
        }

        // Quantidade de elementos abaixo da diagonal principal: (144 - 12) / 2 = 66
        if (operacao == 'M') {
            soma /= 66.0;
        }
        
        System.out.printf(Locale.US, "%.1f%n", soma);
        leitor.close();
    }
}
