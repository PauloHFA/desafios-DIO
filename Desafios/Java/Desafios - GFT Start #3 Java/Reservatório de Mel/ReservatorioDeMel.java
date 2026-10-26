// Reservatório de Mel

/*
Desafio:
Seu Júlio armazena o mel produzido por suas abelhas em um recipiente de formato
CILÍNDRICO. Informado o volume de mel em cm3 e o diâmetro da parte interna do
recipiente em cm, calcule e mostre:
- A altura (em cm) da parte interna do recipiente: altura = V / area;
- A área (em cm2) da boca (entrada) do recipiente: area = 3.14 * R^2;
Onde R = D / 2 e pi = 3.14.

Entrada:
A entrada contém vários casos de teste e termina com EOF. Cada caso consiste
de dois valores de ponto flutuante: V (volume) e D (diâmetro).

Saída:
Para cada teste, imprima:
ALTURA = X.XX
AREA = Y.YY
com 2 casas decimais.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ReservatorioDeMel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        while (leitor.hasNextDouble()) {
            double v = leitor.nextDouble();
            double d = leitor.nextDouble();
            double r = d / 2.0;
            double area = 3.14 * r * r;
            double altura = v / area;
            
            System.out.printf(Locale.US, "ALTURA = %.2f%n", altura);
            System.out.printf(Locale.US, "AREA = %.2f%n", area);
        }
        
        leitor.close();
    }
}
