// Duas Notas

/*
Desafio
Gilberto é um famoso vendedor de esfirras na região. Porém, embora todos gostem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja, nem mais nem menos do que duas notas. É claro que mais uma vez ele quer sua ajuda para fazer um programa que determine se é possível pagar o troco utilizado exatamente duas notas.

As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

Entrada
A entrada deve conter o valor inteiro N da compra e o valor inteiro M pago pelo cliente (N < M <= 10^4). A entrada termina com N = M = 0.

Saída
Seu programa deverá imprimir "possible" se for possível devolver o troco exato com duas notas ou "impossible" se não for possível.
*/

import java.io.IOException;
import java.util.Scanner;

public class DuasNotas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] notas = {2, 5, 10, 20, 50, 100};

        while (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int m = leitor.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int troco = m - n;
            boolean possivel = false;

            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas.length; j++) {
                    if (notas[i] + notas[j] == troco) {
                        possivel = true;
                        break;
                    }
                }
                if (possivel) break;
            }

            if (possivel) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
        }
        leitor.close();
    }
}