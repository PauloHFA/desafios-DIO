// Visita na Feira

/*
Faça a soma de A e B atribuindo o resultado em X.

Entrada
2 inteiros.

Saída
"X = " total.
*/

import java.io.IOException;
import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("X = " + (a + b));
        }
        sc.close();
    }
}