// Senha Fixa

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida (2002).
Para cada senha inválida: "Senha Invalida".
Ao acertar: "Acesso Permitido" e encerra.
*/

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int senha = sc.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}