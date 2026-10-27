// Lanche

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

1 - Cachorro Quente - R$ 4.00
2 - X-Salada - R$ 4.50
3 - X-Bacon - R$ 5.00
4 - Torrada simples - R$ 2.00
5 - Refrigerante - R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            int X = input.nextInt();
            int Y = input.nextInt();
            double preco = 0.0;

            if (X == 1) {
                preco = 4.00 * Y;
            } else if (X == 2) {
                preco = 4.50 * Y;
            } else if (X == 3) {
                preco = 5.00 * Y;
            } else if (X == 4) {
                preco = 2.00 * Y;
            } else if (X == 5) {
                preco = 1.50 * Y;
            }

            System.out.printf(Locale.US, "Total: R$ %.2f\n", preco);
        }

        input.close();
    }
}
