// Soma Simples

/*
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade.
*/

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int soma = a + b;
            System.out.println("SOMA = " + soma);
        }
        sc.close();
    }
}