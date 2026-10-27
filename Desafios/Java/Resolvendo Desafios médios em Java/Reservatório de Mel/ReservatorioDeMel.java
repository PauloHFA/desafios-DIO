// Reservatório de Mel

/*
Calcular a altura e a área da boca de um reservatório cilíndrico de mel.
PI = 3.14

Entrada
Vários casos de teste com V e D terminando em EOF.

Saída
"ALTURA = X.XX" e "AREA = Y.YY".
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ReservatorioDeMel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        while (leitor.hasNextDouble()) {
            double v = leitor.nextDouble();
            if (!leitor.hasNextDouble()) break;
            double d = leitor.nextDouble();
            double r = d / 2.0;
            double area = 3.14 * r * r;
            double altura = v / area;

            System.out.printf(Locale.US, "ALTURA = %.2f\n", altura);
            System.out.printf(Locale.US, "AREA = %.2f\n", area);
        }
        leitor.close();
    }
}