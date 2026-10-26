// Triângulo

/*
Desafio:
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
"Perimetro = XX.X"

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura:
"Area = XX.X"

Entrada:
A entrada contém três valores reais.

Saída:
O resultado deve ser apresentado com uma casa decimal.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        // Condição de existência de um triângulo: cada lado é menor que a soma dos outros dois
        if (a < b + c && b < a + c && c < a + b) {
            double perimetro = a + b + c;
            System.out.printf(Locale.US, "Perimetro = %.1f%n", perimetro);
        } else {
            double areaTrapezio = ((a + b) * c) / 2.0;
            System.out.printf(Locale.US, "Area = %.1f%n", areaTrapezio);
        }
        
        leitor.close();
    }
}
