// Fuso Horário

/*
Romeu e Julieta acabaram de casar e estão planejando a viagem de lua de mel. Eles sabem que o avião sai do aeroporto em um determinado horário, leva um certo tempo para chegar ao destino e que o fuso horário da cidade de destino é diferente do de origem.
Escreva um programa que calcule o horário de chegada do avião no destino (na hora local).

Entrada
A entrada é composta por três inteiros: S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5), que correspondem, respectivamente, ao horário de saída, ao tempo de viagem e ao fuso horário em relação à cidade de origem.

Saída
Imprima um único inteiro indicando o horário local de chegada do voo no país de destino.
*/

import java.io.IOException;
import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int horasaida = sc.nextInt();
            int tempoviagem = sc.nextInt();
            int fuso = sc.nextInt();

            int chegada = (horasaida + tempoviagem + fuso) % 24;
            if (chegada < 0) {
                chegada += 24;
            }

            System.out.println(chegada);
        }
        sc.close();
    }
}
