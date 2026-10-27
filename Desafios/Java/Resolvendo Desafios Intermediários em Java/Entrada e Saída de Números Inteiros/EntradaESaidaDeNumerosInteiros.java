// Entrada e Saída de Números Inteiros

/*
1. A = X, B = Y, C = Z
2. com 10 dígitos justificado à direita
3. com 10 dígitos preenchido com zeros
4. com 10 dígitos justificado à esquerda
*/

import java.io.IOException;
import java.util.Scanner;

public class EntradaESaidaDeNumerosInteiros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNextInt()) {
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            int c = leitor.nextInt();

            System.out.printf("A = %d, B = %d, C = %d\n", a, b, c);
            System.out.printf("A = %10d, B = %10d, C = %10d\n", a, b, c);
            System.out.printf("A = %010d, B = %010d, C = %010d\n", a, b, c);
            System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", a, b, c);
        }
        leitor.close();
    }
}