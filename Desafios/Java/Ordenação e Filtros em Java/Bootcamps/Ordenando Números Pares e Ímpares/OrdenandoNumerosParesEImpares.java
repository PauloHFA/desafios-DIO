// Ordenando Números Pares e Ímpares

/*
Crie um programa onde você receberá valores inteiros não negativos como entrada.
Ordene estes valores de forma que os pares fiquem primeiro em ordem crescente,
e depois os ímpares em ordem decrescente.

Entrada
A primeira linha contém um número N. As próximas N linhas contêm um valor inteiro cada.

Saída
Exiba todos os números ordenados conforme a especificação.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoNumerosParesEImpares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaN = br.readLine();
        if (linhaN != null && !linhaN.trim().isEmpty()) {
            int n = Integer.parseInt(linhaN.trim());
            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                if (line == null) break;
                int val = Integer.parseInt(line.trim());
                if (val % 2 == 0) {
                    pares.add(val);
                } else {
                    impares.add(val);
                }
            }

            Collections.sort(pares);
            impares.sort(Collections.reverseOrder());

            for (int num : pares) {
                System.out.println(num);
            }
            for (int num : impares) {
                System.out.println(num);
            }
        }
    }
}