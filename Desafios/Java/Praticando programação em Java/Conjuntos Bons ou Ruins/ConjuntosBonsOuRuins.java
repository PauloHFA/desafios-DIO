// Conjuntos Bons ou Ruins

/*
Neste problema você deverá analisar um conjunto de palavras e verificar se nenhuma
palavra é prefixo de outra. Se nenhuma palavra for prefixo de outra, o conjunto é Bom,
caso contrário é Ruim.

Entrada
A primeira linha contém N (1 <= N <= 100000). A entrada termina com N = 0.

Saída
"Conjunto Bom" ou "Conjunto Ruim".
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConjuntosBonsOuRuins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            int n = Integer.parseInt(line);
            if (n == 0) break;

            List<String> palavras = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                palavras.add(br.readLine().trim());
            }

            Collections.sort(palavras);

            boolean ruim = false;
            for (int i = 0; i < n - 1; i++) {
                if (palavras.get(i + 1).startsWith(palavras.get(i))) {
                    ruim = true;
                    break;
                }
            }

            if (ruim) {
                System.out.println("Conjunto Ruim");
            } else {
                System.out.println("Conjunto Bom");
            }
        }
    }
}