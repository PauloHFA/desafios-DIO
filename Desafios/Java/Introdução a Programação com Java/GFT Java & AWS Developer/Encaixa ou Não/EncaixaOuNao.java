// Encaixa ou Não

/*
Verificar se B corresponde aos últimos dígitos de A.

Entrada
A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste.
Cada caso consiste de dois valores A e B.

Saída
Para cada caso imprima "encaixa" ou "nao encaixa".
*/

import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            for (int i = 0; i < n; i++) {
                String a = leitor.next();
                String b = leitor.next();
                if (a.endsWith(b)) {
                    System.out.println("encaixa");
                } else {
                    System.out.println("nao encaixa");
                }
            }
        }
        leitor.close();
    }
}