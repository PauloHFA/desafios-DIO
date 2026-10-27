import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            if ((b != 0 && a % b == 0) || (a != 0 && b % a == 0)) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
        scan.close();
    }
}