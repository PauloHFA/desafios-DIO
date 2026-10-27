// Tempo de Jogo

import java.io.IOException;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int inicio = scan.nextInt();
            int fim = scan.nextInt();
            int duracao;

            if (inicio == fim) {
                duracao = 24;
            } else if (fim > inicio) {
                duracao = fim - inicio;
            } else {
                duracao = (24 - inicio) + fim;
            }

            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        scan.close();
    }
}