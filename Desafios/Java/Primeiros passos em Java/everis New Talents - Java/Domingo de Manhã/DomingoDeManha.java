// Domingo de Manhã

/*
Calcular o atraso máximo de Bino ao chegar após as 8:00 (ele demora até 60 min para chegar).

Entrada
Horário H no formato HH:MM.

Saída
"Atraso maximo: X".
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