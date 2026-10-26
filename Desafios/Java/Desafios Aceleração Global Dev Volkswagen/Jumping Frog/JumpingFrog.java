// Jumping Frog

/*
Desafio:
No jogo Jumping Frog, um sapo precisa saltar por uma sequência de N canos de diferentes
alturas da esquerda para a direita. O sapo consegue pular se a diferença de altura entre
dois canos consecutivos for no máximo igual à sua altura de pulo P (|cano[i+1] - cano[i]| <= P).
Caso contrário, o sapo falha ("GAME OVER"). Se conseguir alcançar o último cano, "YOU WIN".

Entrada:
A primeira linha contém dois inteiros P e N (altura do pulo e número de canos).
A segunda linha contém N inteiros indicando a altura de cada cano da esquerda para a direita.

Saída:
"YOU WIN" se o sapo conseguir chegar ao final, ou "GAME OVER" caso contrário.
*/

import java.io.IOException;
import java.util.Scanner;

public class JumpingFrog {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int p = sc.nextInt();
            int n = sc.nextInt();
            
            int[] canos = new int[n];
            for (int i = 0; i < n; i++) {
                canos[i] = sc.nextInt();
            }
            
            boolean venceu = true;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(canos[i + 1] - canos[i]) > p) {
                    venceu = false;
                    break;
                }
            }
            
            if (venceu) {
                System.out.println("YOU WIN");
            } else {
                System.out.println("GAME OVER");
            }
        }
        
        sc.close();
    }
}
