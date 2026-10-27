import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            for (int i = 2; i <= n; i += 2) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}