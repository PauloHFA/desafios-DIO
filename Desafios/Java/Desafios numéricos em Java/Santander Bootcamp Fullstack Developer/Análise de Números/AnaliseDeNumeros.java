// Análise de Números

/*
Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
*/

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            if (leitor.hasNextInt()) {
                int num = leitor.nextInt();
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (num > 0) {
                    positivos++;
                } else if (num < 0) {
                    negativos++;
                }
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        leitor.close();
    }
}
