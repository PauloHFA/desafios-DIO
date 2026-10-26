// Contagem Repetida de Números

/*
Desafio:
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada
número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na
entrada por ordem crescente de valor.

Entrada:
A primeira linha de entrada contém um único inteiro N, que indica a quantidade de valores
que serão lidos em seguida.

Saída:
Imprima a saída indicando quantas vezes cada valor aparece na entrada por ordem crescente.
Exemplo: "X aparece Y vez(es)".
*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContagemRepetidaNumeros {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        if (scr.hasNextInt()) {
            int valores = scr.nextInt();
            Map<Integer, Integer> contagem = new TreeMap<>();
        
            for (int i = 0; i < valores; i++) {
                int numero = scr.nextInt();
                contagem.put(numero, contagem.getOrDefault(numero, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
                System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
            }
        }
        
        scr.close();
    }
}
