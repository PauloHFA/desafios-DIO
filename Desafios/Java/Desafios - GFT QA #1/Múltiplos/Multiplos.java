// Múltiplos

/*
Desafio:
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
múltiplos entre si.

Entrada:
A entrada contém 2 valores inteiros.

Saída:
A saída deve conter uma das mensagens: "Sao Multiplos" ou "Nao sao Multiplos".
*/

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        leitor.close();
    }
}
