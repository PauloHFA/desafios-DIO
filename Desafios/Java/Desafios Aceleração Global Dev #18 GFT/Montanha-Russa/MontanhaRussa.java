// Montanha-Russa

/*
Desafio:
Dado o número de visitantes N, altura mínima Amin, altura máxima Amax e as alturas
de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.

Entrada:
A entrada contém vários casos de teste e termina com fim-de-arquivo (EOF).
A primeira linha de cada caso consiste em três inteiros N, Amin e Amax (1 <= N <= 100,
50 <= Amin <= Amax <= 250). As N linhas seguintes contêm a altura de cada visitante.

Saída:
Para cada caso de teste, imprima uma linha com o número de visitantes autorizados.
*/

import java.io.IOException;
import java.util.Scanner;

public class MontanhaRussa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int min = sc.nextInt();
            int max = sc.nextInt();
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                int altura = sc.nextInt();
                if (altura >= min && altura <= max) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
