import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int count = 0;

        while (scan.hasNextInt()) {
            int idade = scan.nextInt();
            if (idade < 0) {
                break;
            }
            soma += idade;
            count++;
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.printf(Locale.US, "%.2f\n", media);
        }
        scan.close();
    }
}