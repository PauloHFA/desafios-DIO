// Contagem Repetida de números

/*
Desafio
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 <= N <= 2000) logo em seguida.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.
*/

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Map<Integer, Integer> contagem = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int valor = sc.nextInt();
                contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
                System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
            }
        }
        sc.close();
    }
}