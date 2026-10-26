// Fibonacci Rápido

/*
A fórmula de Binet é uma forma de calcular números de Fibonacci.
Fibonacci(n) = ( ((1 + sqrt(5)) / 2)^n - ((1 - sqrt(5)) / 2)^n ) / sqrt(5)

Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada:
A entrada é um número natural n (0 < n <= 50).

Saída:
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet.
*/

import java.util.Locale;
import java.util.Scanner;

public class FibonacciRapido {

    public static double fibonacci(int n) {
        double raiz5 = Math.sqrt(5);
        double parte1 = (1.0 + raiz5) / 2.0;
        double parte2 = (1.0 - raiz5) / 2.0;

        return (Math.pow(parte1, n) - Math.pow(parte2, n)) / raiz5;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        System.out.printf(Locale.US, "%.1f%n", fibonacci(valor));
        sc.close();
    }
}
