// Ordenando Números Pares e Ímpares

/*
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:
- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000).
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoNumerosParesImpares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        if (linha != null && !linha.trim().isEmpty()) {
            int n = Integer.parseInt(linha.trim());

            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String valStr = br.readLine();
                if (valStr != null && !valStr.trim().isEmpty()) {
                    int val = Integer.parseInt(valStr.trim());
                    if (val % 2 == 0) {
                        pares.add(val);
                    } else {
                        impares.add(val);
                    }
                }
            }

            Collections.sort(pares);
            impares.sort(Collections.reverseOrder());

            for (int x : pares) {
                System.out.println(x);
            }
            for (int x : impares) {
                System.out.println(x);
            }
        }
    }
}
