// Diferença

/*
DIFERENCA = (A * B - C * D)

Entrada
4 valores inteiros.

Saída
"DIFERENCA = X".
*/

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            int c = leitor.nextInt();
            int d = leitor.nextInt();
            int dif = (a * b) - (c * d);
            System.out.println("DIFERENCA = " + dif);
        }
        leitor.close();
    }
}