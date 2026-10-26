// Visita na Feira

/*
Desafio:
Você está na feira com a sua sacola e precisa comprar alguns produtos.
Faça um programa que leia dois valores inteiros A e B e efetue a soma dos mesmos,
atribuindo o seu resultado à variável X.
Imprima X da forma apresentada abaixo. Não apresente mensagem menos a que está especificada.

Entrada:
A entrada contém 2 valores inteiros.

Saída:
Imprima a mensagem "X = " (com espaço após o igual) seguido pelo valor da variável X
e pelo final de linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int total = a + b;
        
        System.out.println("X = " + total);
        scan.close();
    }
}
