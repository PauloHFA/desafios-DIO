// Cachorros-Quentes

/*
Desafio:
Dados o número total de cachorros-quentes consumidos e o número total de participantes
na competição, determine o número médio de cachorros-quentes consumidos por participante.

Entrada:
A entrada consiste de uma única linha que contém dois inteiros H e P (1 <= H, P <= 1000)
indicando respectivamente o total de cachorros-quentes e o total de participantes.

Saída:
Produza uma linha com um número racional representando a média com exatamente dois
dígitos após o ponto decimal.
*/

import java.util.Locale;
import java.util.Scanner;

public class CachorrosQuentes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int p = sc.nextInt();
        
        double media = (double) h / p;
        System.out.printf(Locale.US, "%.2f%n", media);
        
        sc.close();
    }
}
