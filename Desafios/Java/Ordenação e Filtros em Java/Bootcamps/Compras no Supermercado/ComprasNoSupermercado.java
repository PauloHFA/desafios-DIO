// Compras no Supermercado

/*
Pedro costuma anotar cada item na lista de compras. Sua tarefa é excluir os itens
duplicados da lista de compras e ordená-los alfabeticamente.

Entrada
A primeira linha de entrada contém um inteiro N com a quantidade de casos de teste.
Cada lista de compra consiste de uma única linha contendo palavras separadas por espaço.

Saída
A saída contém N linhas, cada uma representando uma lista de compra sem repetições e ordenada.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ComprasNoSupermercado {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaN = br.readLine();
        if (linhaN != null && !linhaN.trim().isEmpty()) {
            int n = Integer.parseInt(linhaN.trim());
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                if (line == null) break;
                String resultado = Arrays.stream(line.trim().split("\\s+"))
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining(" "));
                System.out.println(resultado);
            }
        }
    }
}