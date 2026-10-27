// Ordenação de palavras por tamanho

/*
Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho.
Seu programa deve receber um conjunto de palavras e retornar este mesmo
conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das
palavras for igual, deve-se ordenar por ordem alfabética.

Entrada
A primeira linha da entrada possui um único inteiro N, que indica o número
de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive.

Saída
A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho
das palavras e caso o tamanho das palavras for igual, deve-se ordenar por
ordem alfabética. Um espaço em branco deve ser impresso entre duas palavras.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPalavrasPorTamanho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha1 = br.readLine();
        if (linha1 != null && !linha1.trim().isEmpty()) {
            int linhas = Integer.parseInt(linha1.trim());

            for (int i = 0; i < linhas; i++) {
                String palavras = br.readLine();
                if (palavras == null) break;

                List<String> listaPalavras = new ArrayList<>(Arrays.asList(palavras.split("\\s+")));
                String listaOrdenada = listaPalavras.stream()
                    .sorted(Comparator.comparingInt(String::length).reversed()
                    .thenComparing(String::compareTo))
                    .collect(Collectors.joining(" "));

                System.out.println(listaOrdenada);
            }
        }
    }
}