import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        if (scan.hasNextDouble()) {
            double raio = scan.nextDouble();
            double area = 3.14159 * (raio * raio);
            System.out.printf(Locale.US, "A=%.4f\n", area);
        }
        scan.close();
    }
}