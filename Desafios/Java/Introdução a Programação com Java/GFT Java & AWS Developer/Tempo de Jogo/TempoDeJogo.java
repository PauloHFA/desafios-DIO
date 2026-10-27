// Tempo de Jogo

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo: "O JOGO DUROU X HORA(S)".
*/

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