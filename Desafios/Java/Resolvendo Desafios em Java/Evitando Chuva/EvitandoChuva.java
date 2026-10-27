// Evitando Chuva

/*
Descobrir quantos guarda-chuvas comprar para casa e para o trabalho.

Entrada
N (quantidade de dias). Seguem N linhas com previsão de ida e volta ("sol" ou "chuva").

Saída
C e E (guarda-chuvas comprados em casa e no escritório).
*/

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int casaComprado = 0;
            int casaSobrando = 0;
            int trabComprado = 0;
            int trabSobrando = 0;

            for (int i = 0; i < n; i++) {
                String ida = leitor.next();
                String volta = leitor.next();

                if (ida.equalsIgnoreCase("chuva")) {
                    if (casaSobrando > 0) {
                        casaSobrando--;
                    } else {
                        casaComprado++;
                    }
                    trabSobrando++;
                }

                if (volta.equalsIgnoreCase("chuva")) {
                    if (trabSobrando > 0) {
                        trabSobrando--;
                    } else {
                        trabComprado++;
                    }
                    casaSobrando++;
                }
            }

            System.out.println(casaComprado + " " + trabComprado);
        }
        leitor.close();
    }
}