// Notas e Moedas

/*
Desafio:
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um
valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual
o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.

Entrada:
O arquivo de entrada contém um valor de ponto flutuante N (0 <= N <= 1000000.00).

Saída:
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial.
*/

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        
        // Conversão para centavos inteiros para evitar imprecisões de ponto flutuante
        int resto = (int) Math.round(n * 100.0);

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int centavosNota = nota * 100;
            int quantidade = resto / centavosNota;
            System.out.printf(Locale.US, "%d nota(s) de R$ %d.00%n", quantidade, nota);
            resto %= centavosNota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = resto / moeda;
            double valorMoeda = moeda / 100.0;
            System.out.printf(Locale.US, "%d moeda(s) de R$ %.2f%n", quantidade, valorMoeda);
            resto %= moeda;
        }

        sc.close();
    }
}
