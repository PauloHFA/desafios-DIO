// Head or Tail

/*
Desafio:
John e Mary jogam cara ou coroa para decidir atividades do dia a dia.
Mary sempre escolhe Cara (0) e John sempre escolhe Coroa (1).
Dado o histórico de resultados, conte quantas vezes cada um venceu.

Entrada:
A entrada contém vários casos de teste. A primeira linha contém um inteiro N
(número de jogos). A linha seguinte contém N inteiros (0 para vitória de Mary, 1 para John).
O fim da entrada é indicado por N = 0.

Saída:
Para cada caso, imprima "Mary won X times and John won Y times".
*/

import java.io.IOException;
import java.util.Scanner;

public class HeadOrTail {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }

            int mary = 0;
            int john = 0;

            for (int i = 0; i < n; i++) {
                int resultado = in.nextInt();
                if (resultado == 0) {
                    mary++;
                } else {
                    john++;
                }
            }

            System.out.printf("Mary won %d times and John won %d times%n", mary, john);
        }

        in.close();
    }
}
