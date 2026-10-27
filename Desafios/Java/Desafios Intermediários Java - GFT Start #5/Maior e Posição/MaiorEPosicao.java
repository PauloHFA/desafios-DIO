// Maior e Posição

/*
Desafio
Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

import java.io.IOException;
import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int posicao = -1;

        for (int i = 1; i <= 100; i++) {
            if (scan.hasNextInt()) {
                int valor = scan.nextInt();
                if (valor > max) {
                    max = valor;
                    posicao = i;
                }
            }
        }

        System.out.println(max);
        System.out.println(posicao);
        scan.close();
    }
}
