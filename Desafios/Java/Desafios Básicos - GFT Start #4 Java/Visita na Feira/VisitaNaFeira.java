// Visita na Feira

/*
Você está na feira com a sua sacola e precisa comprar alguns tomates e cebolas.
Faça um programa que leia dois valores inteiros que representem a quantidade de
tomates e a quantidade de cebolas adquiridas. Em seguida, calcule e mostre o
total de vegetais adquiridos na sua viagem à feira.

Entrada
A entrada contém dois valores inteiros, representando a quantidade de tomates e a
quantidade de cebolas compradas, respectivamente.

Saída
Imprima a mensagem "X = " (sempre em maiúsculas) seguido pela soma dos dois
valores inteiros lidos e pelo final de linha. Não esqueça do espaço em branco
antes e depois do sinal de igualdade.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class VisitaNaFeira {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        if (linha != null) {
            StringTokenizer st = new StringTokenizer(linha);
            if (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int total = a + b;
                System.out.println("X = " + total);
            }
        }
    }
}
