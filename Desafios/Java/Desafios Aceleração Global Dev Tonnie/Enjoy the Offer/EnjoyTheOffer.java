// Enjoy the Offer

/*
Desafio:
Um supermercado está fazendo uma promoção de refrigerantes. Se você comprar refrigerantes
em um dia e levar as garrafas vazias no dia seguinte, eles trocam cada conjunto de K
garrafas vazias por uma cheia. Um cliente comprou N garrafas no primeiro dia e quer saber
quantas garrafas terá no final do segundo dia se aproveitar a oferta ao máximo.

Entrada:
A primeira linha contém um inteiro T (1 <= T <= 10000), indicando o número de casos de teste.
Cada uma das T linhas seguintes contém dois inteiros N e K (1 <= K, N <= 10000), respectivamente
o número de refrigerantes comprados e o número de garrafas vazias para ganhar uma cheia.

Saída:
Para cada caso de teste, imprima o número de garrafas que o cliente terá no segundo dia.
*/

import java.io.IOException;
import java.util.Scanner;

public class EnjoyTheOffer {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        if (leitor.hasNextInt()) {
            int t = leitor.nextInt();
            
            for (int i = 0; i < t; i++) {
                int n = leitor.nextInt();
                int k = leitor.nextInt();
                
                int garrafasGanha = n / k;
                int garrafasSobram = n % k;
                int totalSegundoDia = garrafasGanha + garrafasSobram;
                
                System.out.println(totalSegundoDia);
            }
        }
        
        leitor.close();
    }
}
