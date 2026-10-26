// Feliz Nataaal!

/*
Desafio:
Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!".
Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um
índice I de felicidade, seu grito de natal é mais animado.

Entrada:
A entrada é composta por um inteiro I (1 < I <= 10^4) que representa o índice de felicidade.

Saída:
A saída é composta pela frase "Feliz natal!", sendo repetida I vezes a última letra 'a' da frase.
*/

import java.io.IOException;
import java.util.Scanner;

public class FelizNataaal {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        if (leitor.hasNextInt()) {
            int i = leitor.nextInt();
            
            StringBuilder sb = new StringBuilder("Feliz nat");
            for (int k = 0; k < i; k++) {
                sb.append('a');
            }
            sb.append("l!");
            
            System.out.println(sb.toString());
        }
        
        leitor.close();
    }
}
