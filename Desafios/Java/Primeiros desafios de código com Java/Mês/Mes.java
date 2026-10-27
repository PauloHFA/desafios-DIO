// Mês

/*
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada.
*/

import java.io.IOException;
import java.util.Scanner;

public class Mes {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int month = input.nextInt();
            String[] meses = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };
            if (month >= 1 && month <= 12) {
                System.out.println(meses[month]);
            }
        }
        input.close();
    }
}