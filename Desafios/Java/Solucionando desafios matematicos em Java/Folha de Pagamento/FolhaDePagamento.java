import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        if (scan.hasNextInt()) {
            int numero = scan.nextInt();
            int horas = scan.nextInt();
            double valorHora = scan.nextDouble();

            double salario = horas * valorHora;
            System.out.println("NUMBER = " + numero);
            System.out.printf(Locale.US, "SALARY = U$ %.2f\n", salario);
        }
        scan.close();
    }
}