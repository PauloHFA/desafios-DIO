// Batmain

/*
Para cada vilão que Batman enfrentou, imprima "Y".

Entrada
T (casos de teste) e os nomes dos vilões.

Saída
"Y" para cada vilão.
*/

import java.io.IOException;
import java.util.Scanner;

public class Batmain {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int t = scan.nextInt();
            for (int i = 0; i < t; i++) {
                String vilao = scan.next();
                System.out.println("Y");
            }
        }
        scan.close();
    }
}