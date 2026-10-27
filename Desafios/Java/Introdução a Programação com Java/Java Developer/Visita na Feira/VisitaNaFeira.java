// Visita na Feira

/*
Faça a soma de A e B atribuindo o seu resultado na variável X.

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprimir a mensagem "X = " seguido pelo valor da variável X.
*/

import java.io.IOException;
import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("X = " + (a + b));
        }
        sc.close();
    }
}