// Dama

/*
O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama (ou rainha), que pode se mover qualquer número de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais.
O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em um tabuleiro de xadrez padrão (8 × 8), quantos movimentos são necessários para ela chegar a outra casa do tabuleiro?
Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu a sua ajuda para resolver esse desafio.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por quatro inteiros: X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a de coordenadas (X2, Y2). No tabuleiro, as linhas são numeradas de 1 a 8, de cima para baixo; e as colunas de 1 a 8, da esquerda para a direita. O final da entrada é indicado por X1 = Y1 = X2 = Y2 = 0.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa de destino.
*/

import java.io.IOException;
import java.util.Scanner;

public class Dama {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }

            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            } else if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
