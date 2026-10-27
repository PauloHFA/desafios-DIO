// Média 3

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        if (sc.hasNextDouble()) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double n4 = sc.nextDouble();

            double media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;
            // Truncate to 1 decimal place as in URI 1040
            BigDecimal bdMedia = new BigDecimal(String.valueOf(media)).setScale(1, RoundingMode.FLOOR);
            media = bdMedia.doubleValue();

            System.out.printf(Locale.US, "Media: %.1f\n", media);

            if (media >= 7.0) {
                System.out.println("Aluno aprovado.");
            } else if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno em exame.");
                if (sc.hasNextDouble()) {
                    double notaExame = sc.nextDouble();
                    System.out.printf(Locale.US, "Nota do exame: %.1f\n", notaExame);
                    double mediaFinal = (media + notaExame) / 2.0;

                    if (mediaFinal >= 5.0) {
                        System.out.println("Aluno aprovado.");
                    } else {
                        System.out.println("Aluno reprovado.");
                    }
                    System.out.printf(Locale.US, "Media final: %.1f\n", mediaFinal);
                }
            }
        }
        sc.close();
    }
}