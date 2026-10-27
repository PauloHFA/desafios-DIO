import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int prod = a * b;
            System.out.println("PROD = " + prod);
        }
        scan.close();
    }
}