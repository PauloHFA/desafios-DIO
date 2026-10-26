// Galopeira

/*
Desafio:
Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi gasto
para ser digitada, sabendo que cada letra digitada leva 0.01 segundo.

Entrada:
Um número inteiro C será informado, que será a quantidade de casos de teste.
Cada caso tem uma palavra de 9 a 10000 letras.

Saída:
Para cada caso de teste, imprima o tempo T gasto em segundos com 2 casas decimais.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Galopeira {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        if (leitor.hasNextInt()) {
            int c = leitor.nextInt();
            
            for (int i = 0; i < c; i++) {
                String palavra = leitor.next();
                double tempo = palavra.length() / 100.0;
                System.out.printf(Locale.US, "%.2f%n", tempo);
            }
        }
        
        leitor.close();
    }
}
