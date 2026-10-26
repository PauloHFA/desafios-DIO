// Andando no Tempo

/*
Desafio:
Imagine que você tem uma máquina do tempo que pode ser usada no máximo três vezes,
e a cada uso da máquina você deve viajar para o passado ou para o futuro.
A máquina possui três créditos fixos de viagem: A, B e C anos.
Você quer saber se é possível voltar para o presente (ano zero de deslocamento)
usando a máquina uma, duas ou três vezes.

Entrada:
A entrada consiste de uma linha contendo os valores dos três créditos A, B e C (1 <= A, B, C <= 1000).

Saída:
Seu programa deve imprimir uma linha contendo o caractere 'S' se é possível voltar para o presente,
ou 'N' caso contrário.
*/

import java.io.IOException;
import java.util.Scanner;

public class AndandoNoTempo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        // É possível voltar ao presente se dois créditos forem iguais (vai com um e volta com o outro)
        // ou se a soma de dois créditos for igual ao terceiro.
        if (a == b || a == c || b == c || (a + b == c) || (a + c == b) || (b + c == a)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        leitor.close();
    }
}
