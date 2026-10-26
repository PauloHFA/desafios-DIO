// Tempo de Jogo

/*
Desafio:
Tendo como base a hora inicial e final de um jogo, calcule a duração dele, sabendo
que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de
1 hora (60 minutos) e máxima de 24 horas.

Entrada:
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída:
Apresente a duração do jogo conforme o exemplo: "O JOGO DUROU X HORA(S)".
*/

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int inicio = scan.nextInt();
        int fim = scan.nextInt();
        int horas;

        if (fim > inicio) {
            horas = fim - inicio;
        } else {
            horas = (24 - inicio) + fim;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        scan.close();
    }
}
