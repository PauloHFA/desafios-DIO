// MacPRONALTS

/*
O MacPRONALTS está com uma super promoção com vários lanches com preços muito acessíveis:
1001 - R$ 1.50
1002 - R$ 2.50
1003 - R$ 3.50
1004 - R$ 4.50
1005 - R$ 5.50

Você deve escrever um programa que leia a quantidade de produtos comprados e calcule o valor final da conta.

Entrada
A primeira linha contém a quantidade de produtos que serão comprados (1 ≤ p ≤ 5). As linhas seguintes contêm o número do produto e a respectiva quantidade comprada (1 ≤ q ≤ 500).

Saída
A saída deve apresentar o valor total a ser pago com duas casas decimais após o ponto.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MacPRONALTS {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            double total = 0.0;

            for (int i = 0; i < n; i++) {
                int produto = sc.nextInt();
                int quantidade = sc.nextInt();

                switch (produto) {
                    case 1001: total += 1.50 * quantidade; break;
                    case 1002: total += 2.50 * quantidade; break;
                    case 1003: total += 3.50 * quantidade; break;
                    case 1004: total += 4.50 * quantidade; break;
                    case 1005: total += 5.50 * quantidade; break;
                }
            }

            System.out.printf(Locale.US, "%.2f\n", total);
        }

        sc.close();
    }
}
