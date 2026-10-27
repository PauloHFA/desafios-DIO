// Crescente e Decrescente

/*
Leia duplas X e Y. Indicar se foram digitados em ordem "Crescente" ou "Decrescente".
Encerra quando X == Y.

Entrada
Vários pares X e Y.

Saída
"Crescente" ou "Decrescente".
*/

import java.io.IOException;
import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNextInt()) {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            if (x == y) break;

            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
        leitor.close();
    }
}