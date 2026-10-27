import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int nota = input.nextInt();
            if (nota == 0) {
                System.out.println("E");
            } else if (nota <= 35) {
                System.out.println("D");
            } else if (nota <= 60) {
                System.out.println("C");
            } else if (nota <= 85) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
        input.close();
    }
}