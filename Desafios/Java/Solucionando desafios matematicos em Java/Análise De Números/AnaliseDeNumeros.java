import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            if (!scan.hasNextInt()) break;
            int n = scan.nextInt();
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (n > 0) {
                positivo++;
            } else if (n < 0) {
                negativo++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        scan.close();
    }
}