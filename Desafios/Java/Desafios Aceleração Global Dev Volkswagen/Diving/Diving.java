// Diving

/*
Desafio:
Em uma competição de saltos ornamentais, cada salto tem um grau de dificuldade e é
avaliado por sete juízes (notas de 0 a 10). Após apresentadas as notas, a maior e a menor
nota são descartadas. As notas restantes são somadas e o resultado é multiplicado pelo
grau de dificuldade do salto.
Exiba o nome de cada competidor seguido de sua pontuação final formatada com duas casas decimais.

Entrada:
A primeira linha contém o número de competidores N. Em seguida, para cada competidor:
o nome, o grau de dificuldade D e, na linha seguinte, as sete notas dadas pelos juízes.

Saída:
O nome de cada competidor seguido da pontuação final com 2 casas decimais.
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        if (input.hasNextInt()) {
            int competidores = input.nextInt();
            
            for (int i = 0; i < competidores; i++) {
                String nome = input.next();
                double dificuldade = input.nextDouble();
                
                double[] notas = new double[7];
                for (int j = 0; j < 7; j++) {
                    notas[j] = input.nextDouble();
                }
                
                Arrays.sort(notas);
                
                // Soma descartando a menor (índice 0) e a maior (índice 6)
                double somaMeio = 0.0;
                for (int j = 1; j <= 5; j++) {
                    somaMeio += notas[j];
                }
                
                double total = somaMeio * dificuldade;
                System.out.printf(Locale.US, "%s %.2f%n", nome, total);
            }
        }
        
        input.close();
    }
}
