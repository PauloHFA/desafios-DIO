// Distância

/*
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y com 90 Km/h.
Calcular quanto tempo leva (em minutos) para a moto Y tomar a distância K da moto X.

Entrada
Um número inteiro K.

Saída
Tempo necessário seguido de " minutos".
*/

import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int k = input.nextInt();
            System.out.println((k * 2) + " minutos");
        }
        input.close();
    }
}