// Contagem de Cédulas

/*
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de
notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você
deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor
lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias,
seguindo o exemplo de saída abaixo. Após cada linha deve ser impresso o fim
de linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int valor = leitor.nextInt();
            System.out.println(valor);

            int[] notas = {100, 50, 20, 10, 5, 2, 1};
            int restante = valor;

            for (int nota : notas) {
                int qtd = restante / nota;
                restante %= nota;
                System.out.println(qtd + " nota(s) de R$ " + nota + ",00");
            }
        }
        leitor.close();
    }
}