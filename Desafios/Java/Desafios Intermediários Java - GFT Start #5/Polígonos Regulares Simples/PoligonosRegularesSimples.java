// Polígonos Regulares Simples

/*
Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam.

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.

Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 e 1 ≤ L ≤ 4000).

Saída
A saída é o perímetro P do polígono regular em uma única linha.

Exemplos de Entrada	Exemplos de Saída
3 1                 3
9 8                 72
1000000 1000        1000000000
*/

import java.io.IOException;
import java.util.Scanner;

public class PoligonosRegularesSimples {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextLong()) {
            long N = scan.nextLong();
            long L = scan.nextLong();
            long P = N * L;
            System.out.println(P);
        }
        scan.close();
    }
}
