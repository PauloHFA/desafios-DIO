// Notação Científica

/*
Desafio:
Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos,
é conveniente usar a notação científica.
Você deve escrever um programa que, dado um número em ponto flutuante, mostre este
número na notação científica:
- sempre mostre o sinal da mantissa;
- sempre mostre 4 casas decimais na mantissa;
- use o caractere 'E' para separar a mantissa do expoente;
- sempre mostre o sinal do expoente;
- mostre o expoente com pelo menos 2 dígitos.

Entrada:
A entrada é um número em ponto flutuante de dupla precisão X.

Saída:
A saída é o número X em uma única linha na notação científica detalhada acima.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NotacaoCientifica {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String entrada = sc.next();
        double valor = Double.parseDouble(entrada);
        
        // Se a entrada começa explicitamente com '-', preserva o sinal negativo mesmo para 0
        if (entrada.startsWith("-") && valor == 0.0) {
            System.out.printf(Locale.US, "-%.4E%n", 0.0);
        } else {
            System.out.printf(Locale.US, "%+.4E%n", valor);
        }
        
        sc.close();
    }
}
