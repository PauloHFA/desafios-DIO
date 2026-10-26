// Resto da Divisão

/*
Desafio:
Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles
cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada:
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente
em ordem crescente.

Saída:
Imprima todos os valores conforme exemplo, sempre em ordem crescente, um por linha.
*/

import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        if (inp.hasNextInt()) {
            int x = inp.nextInt();
            int y = inp.nextInt();

            int menor = Math.min(x, y);
            int maior = Math.max(x, y);

            for (int i = menor + 1; i < maior; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }

        inp.close();
    }
}
