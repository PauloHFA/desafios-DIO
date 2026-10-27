// Conversão de Tempo

/*
Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos.
*/

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int sec = input.nextInt();
            int hour = sec / 3600;
            int min = (sec % 3600) / 60;
            int remainingSec = sec % 60;
            System.out.println(hour + ":" + min + ":" + remainingSec);
        }
        input.close();
    }
}