// A Resposta de Theon

/*
Ajudar Theon a determinar a pessoa com o menor Ti.

Entrada
N e os N valores Ti.

Saída
O índice da menor resposta.
*/

import java.io.IOException;
import java.util.Scanner;

public class ARespostaDeTheon {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int menor = Integer.MAX_VALUE;
            int pMenor = 1;

            for (int i = 1; i <= n; i++) {
                int t = leitor.nextInt();
                if (t < menor) {
                    menor = t;
                    pMenor = i;
                }
            }
            System.out.println(pMenor);
        }
        leitor.close();
    }
}