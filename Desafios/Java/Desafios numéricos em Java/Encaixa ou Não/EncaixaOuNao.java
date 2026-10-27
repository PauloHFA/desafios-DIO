// Encaixa ou Não

/*
Desafio
Paulinho tem em suas mãos um novo problema. Agora a sua professora lhe pediu que construísse
um programa para verificar, a partir de dois valores muito grandes A e B, se B corresponde aos últimos
dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade
de casos de teste. Cada caso de teste consiste de dois valores A e B maiores que zero, cada um deles podendo
ter até 1000 dígitos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, conforme exemplo abaixo.
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
