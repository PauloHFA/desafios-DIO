// Análise De Números

/*
Desafio:
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores
informados são pares, quantos valores informados são ímpares, quantos valores
informados são positivos e quantos valores informados são negativos.

Entrada:
Você receberá 5 valores inteiros.

Saída:
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha:
- X valor(es) par(es)
- X valor(es) impar(es)
- X valor(es) positivo(s)
- X valor(es) negativo(s)
*/

import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();

            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        
        scan.close();
    }
}
