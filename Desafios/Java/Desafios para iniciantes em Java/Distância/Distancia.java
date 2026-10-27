// Distância

/*
Desafio
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".
*/

import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int km = input.nextInt();
            System.out.println((km * 2) + " minutos");
        }
        input.close();
    }
}