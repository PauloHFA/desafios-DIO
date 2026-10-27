// A Resposta de Theon

/*
Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a
minimizar o número de vezes que ele será atingido.

Entrada
A primeira linha contém um inteiro N (1 <= N <= 100). A segunda linha contém N
inteiros T1, T2, ..., TN (0 <= Ti <= 20).

Saída
Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu
algoz. Se existe mais de uma resposta possível, imprima a menor.
*/

import java.io.IOException;
import java.util.Scanner;

public class ARespostaDeTheon {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int menor = Integer.MAX_VALUE;
            int posMenor = 1;

            for (int i = 1; i <= n; i++) {
                int t = leitor.nextInt();
                if (t < menor) {
                    menor = t;
                    posMenor = i;
                }
            }
            System.out.println(posMenor);
        }
        leitor.close();
    }
}