import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int totalDias = scan.nextInt();
            int anos = totalDias / 365;
            int resto = totalDias % 365;
            int meses = resto / 30;
            int dias = resto % 30;

            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        scan.close();
    }
}