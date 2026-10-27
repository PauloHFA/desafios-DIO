// Foto Anual

/*
Uma escola está tentando tirar uma foto anual de todos os alunos. É solicitado que os alunos fiquem em uma única fila em linha em ordem crescente de acordo com a altura. Deixe essa ordenação ser representada pelo array de inteiros esperado onde esperado[i] é a altura esperada do i-ésimo aluno na fila.
Você recebe um array inteiro alturas que representa a ordem atual em que os alunos estão. Cada alturas[i] é a altura do i-ésimo aluno na linha (indexado a 0).
Retorne o número de índices onde alturas[i] != esperado[i].

Exemplo 1
Entrada	
6
1
1
4
2
1
3	

Saída
3
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FotoAnual {
    public static int heightChecker(int[] heights) {
        int[] esperado = heights.clone();
        Arrays.sort(esperado);
        int contador = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != esperado[i]) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int tamanho = input.nextInt();
            int[] heights = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                heights[i] = input.nextInt();
            }

            System.out.println(heightChecker(heights));
        }
        input.close();
    }
}
