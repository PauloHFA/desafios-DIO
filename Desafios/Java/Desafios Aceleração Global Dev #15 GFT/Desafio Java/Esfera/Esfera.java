// Esfera

/*
Desafio:
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor
de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R^3.
Considere para pi o valor 3.14159.

Entrada:
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente
ao raio da esfera.

Saída:
A saída deverá ser a mensagem "VOLUME = " seguida do valor calculado com 3 casas decimais.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);

        System.out.printf(Locale.US, "VOLUME = %.3f%n", volume);
        sc.close();
    }
}
