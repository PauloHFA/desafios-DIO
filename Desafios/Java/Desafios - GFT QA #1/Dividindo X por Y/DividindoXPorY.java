// Dividindo X por Y

/*
Desafio:
Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado
da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem
"divisao impossivel" para os valores em questão.

Entrada:
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores
inteiros (X e Y) que serão lidos em seguida.

Saída:
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou
"divisao impossivel" caso não seja possível efetuar o cálculo.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = x / y;
                System.out.printf(Locale.US, "%.1f%n", divisao);
            }
        }
        
        sc.close();
    }
}
