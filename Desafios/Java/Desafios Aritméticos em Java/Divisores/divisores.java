// Divisores

/*
Desafio:
Dados os valores A, B, C e D, determine o menor número positivo n tal que:
1. n é divisível por A (n % A == 0)
2. n NÃO é divisível por B (n % B != 0)
3. C é múltiplo de n (C % n == 0)
4. D NÃO é múltiplo de n (D % n != 0)

Entrada:
Quatro números inteiros A, B, C e D.

Saída:
O menor número n possível, ou -1 caso não exista nenhum número que satisfaça as condições.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            
            // n precisa dividir C e ser múltiplo de A. Se C não é divisível por A, é impossível.
            if (c % a != 0) {
                System.out.println(-1);
            } else {
                List<Integer> divisores = new ArrayList<>();
                int limite = (int) Math.sqrt(c);
                
                for (int i = 1; i <= limite; i++) {
                    if (c % i == 0) {
                        divisores.add(i);
                        if (i * i != c) {
                            divisores.add(c / i);
                        }
                    }
                }
                
                Collections.sort(divisores);
                
                int resposta = -1;
                for (int n : divisores) {
                    if (n % a == 0 && n % b != 0 && d % n != 0) {
                        resposta = n;
                        break;
                    }
                }
                
                System.out.println(resposta);
            }
        }
        
        scanner.close();
    }
}
