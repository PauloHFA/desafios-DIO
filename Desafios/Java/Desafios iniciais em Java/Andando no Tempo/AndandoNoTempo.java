// Andando no Tempo

/*
Amigos e parentes de Tomás sabem que ele é um garoto muito inteligente e com uma imaginação fértil. Ele sempre inventa histórias fantásticas, como viagens espaciais e visitas a terras mágicas.
Desta vez, Tomás inventou uma máquina do tempo! Essa máquina possui três botões que, quando pressionados, avançam ou retrocedem o tempo em quantidades específicas de anos.
Sabendo os anos correspondentes a cada um dos três botões da máquina do tempo de Tomás, sua tarefa é descobrir se é possível ou não Tomás voltar ao presente após usar a máquina uma ou duas vezes, ou utilizando todos os três créditos.

Entrada
A entrada consiste de uma única linha contendo três inteiros A, B e C (1 ≤ A, B, C ≤ 100).

Saída
Seu programa deve imprimir uma linha contendo o caractere "S" se é possível viajar e voltar para o presente, ou "N" caso contrário.
*/

import java.io.IOException;
import java.util.Scanner;

public class AndandoNoTempo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            int c = leitor.nextInt();
            if (a + b == c || a + c == b || b + c == a || a == b || a == c || b == c) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        leitor.close();
    }
}
