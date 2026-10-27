// Ho Ho Ho

/*
Papai Noel está brincando com seus duendes para diverti-los ao longo do ano. Mas
ele está com um problema: Ele não consegue resolver o problema dos Ho's do Noel.
Cada duende tem uma quantidade de Ho's diferente e Papai Noel não sabe como
resolver isso. Ele pediu sua ajuda para criar um programa que ajude a
descobrir a quantidade de "Ho" que cada duende precisa.

Entrada
A entrada é composta por um único inteiro N (0 < N <= 10^6) representando quantos
"Ho" serão falados por Papai Noel.

Saída
A saída é composta por todos "Ho" que Papai Noel deve falar separados por um
espaço. Após o último "Ho" deve ser apresentado um "!" encerrando o programa.
*/

import java.io.IOException;
import java.util.Scanner;

public class HoHoHo {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        if (entrada.hasNextInt()) {
            int num = entrada.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                if (i > 0) sb.append(" ");
                sb.append("Ho");
            }
            sb.append("!");
            System.out.println(sb.toString());
        }
        entrada.close();
    }
}