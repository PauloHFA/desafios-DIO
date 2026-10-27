import java.util.Locale;
import java.util.Scanner;

public class CalculoDeViagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        if (scan.hasNextDouble()) {
            double tempo = scan.nextDouble();
            double velocidade = scan.nextDouble();
            double litros = (tempo * velocidade) / 12.0;
            System.out.printf(Locale.US, "%.3f\n", litros);
        }
        scan.close();
    }
}