// Entrada e Saída CPF

/*
Elabore um programa que possuas as características abaixo:

1. Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
2. Imprima os quatro grupos numéricos, sendo um valor por linha.

Entrada
A entrada consiste em um CPF no formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

Saída
Para cada caso de teste da entrada, imprima os quatro grupos, cada um em uma linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class EntradaESaidaCPF {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String linha = sc.nextLine().trim();
            if (linha.isEmpty()) continue;
            String[] partes = linha.split("[.-]");
            for (String parte : partes) {
                System.out.println(parte);
            }
        }
        sc.close();
    }
}