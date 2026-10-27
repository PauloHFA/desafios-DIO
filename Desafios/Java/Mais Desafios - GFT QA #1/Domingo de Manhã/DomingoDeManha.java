// Domingo de Manhã

/*
Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o atraso máximo de Bino.

Entrada
A entrada consiste em múltiplos casos teste. Cada caso de teste contém um horário H (5:00 <= H <= 9:00) que Bino acordou.

Saída
Para cada caso de teste, imprima "Atraso maximo: X".
*/

import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String linha = leitor.nextLine().trim();
            if (linha.isEmpty()) continue;
            String[] relogio = linha.split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            int atraso = 0;

            if (hora >= 7) {
                atraso = 60 * (hora - 7) + min;
            }

            System.out.println("Atraso maximo: " + atraso);
        }
        leitor.close();
    }
}