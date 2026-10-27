// Multiplicação Simples

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto.

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD.
*/

import java.io.IOException;
import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("PROD = " + (a * b));
        }
        sc.close();
    }
}