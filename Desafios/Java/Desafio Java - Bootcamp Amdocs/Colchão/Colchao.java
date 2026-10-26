// Colchão

/*
João está comprando móveis novos para sua casa. Agora é a vez de comprar um
colchão novo, de molas, para substituir o colchão velho. As portas de sua casa
têm altura H e largura L e existe um colchão que está em promoção com dimensões
A x B x C. O colchão tem a forma de um paralelepípedo reto retângulo e João só
consegue arrastá-lo através de uma porta com uma de suas faces paralelas ao
chão, mas consegue virar e rotacionar o colchão antes de passar pela porta.

Entrada:
A primeira linha da entrada contém três números inteiros A, B e C (1 <= A, B, C <= 300),
as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros
H e L (1 <= H, L <= 250), respectivamente a altura e a largura das portas em centímetros.

Saída:
Seu programa deve escrever uma única linha, contendo apenas a letra 'S' se o
colchão passa pelas portas e apenas a letra 'N' em caso contrário.
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Colchao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int[] colchao = new int[3];
        colchao[0] = leitor.nextInt();
        colchao[1] = leitor.nextInt();
        colchao[2] = leitor.nextInt();
        
        int H = leitor.nextInt();
        int L = leitor.nextInt();
        
        Arrays.sort(colchao);
        
        int minPorta = Math.min(H, L);
        int maxPorta = Math.max(H, L);
        
        if (colchao[0] <= minPorta && colchao[1] <= maxPorta) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        leitor.close();
    }
}
