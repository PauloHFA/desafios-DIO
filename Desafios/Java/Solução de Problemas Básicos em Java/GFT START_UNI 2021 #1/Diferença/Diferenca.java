import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int dif = (a * b) - (c * d);
            System.out.println("DIFERENCA = " + dif);
        }
        scan.close();
    }
}