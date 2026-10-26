// PUM

/*
Desafio:
Desenvolva um programa que leia um valor inteiro N. Este N refere-se à quantidade
de linhas de saída que serão apresentadas na execução do programa.

Entrada:
O arquivo de entrada contém um número inteiro positivo N.

Saída:
Imprima a saída conforme o padrão especificado: 3 números seguidos da palavra PUM.
*/

import java.io.IOException;
import java.util.Scanner;

public class Pum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 1;

            for (int i = 0; i < n; i++) {
                System.out.printf("%d %d %d PUM%n", num, num + 1, num + 2);
                num += 4;
            }
        }
        
        sc.close();
    }
}
