// Cálculo Simples

/*
Desafio:
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário
de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
Após, calcule e mostre o valor a ser pago.

Entrada:
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída:
A saída deverá ser a mensagem "VALOR A PAGAR: R$ " seguida do valor total formatado
com 2 casas decimais.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double total = 0.0;
        for (int i = 0; i < 2; i++) {
            int cod = leitor.nextInt();
            int qtd = leitor.nextInt();
            double valorUnitario = leitor.nextDouble();
            total += qtd * valorUnitario;
        }

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", total);
        leitor.close();
    }
}
