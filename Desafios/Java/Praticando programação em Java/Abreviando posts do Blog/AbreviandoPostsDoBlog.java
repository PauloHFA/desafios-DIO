// Abreviando posts do Blog

/*
Leonardo nos pediu para salvar o seu blog e o seu emprego. Para isso, devemos abreviar
palavras no texto de forma a economizar o máximo de caracteres possível, obedecendo às regras:
- Apenas uma palavra por letra inicial pode ser abreviada.
- A palavra abreviada deve ter mais de 2 caracteres.
- A abreviação substitui a palavra por sua primeira letra seguida de ponto ("w.").
- Uma palavra só deve ser abreviada se sua abreviação economizar mais caracteres no total.

Entrada
Vários casos de teste terminando com uma linha contendo apenas um ponto ".".

Saída
Para cada caso imprima o texto abreviado, a quantidade de palavras abreviadas e a lista de abreviações.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class AbreviandoPostsDoBlog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.equals(".")) break;
            if (line.isEmpty()) continue;

            String[] palavras = line.split("\\s+");
            Map<String, Integer> freq = new HashMap<>();

            for (String p : palavras) {
                if (p.length() > 2) {
                    freq.put(p, freq.getOrDefault(p, 0) + 1);
                }
            }

            // Para cada letra inicial ('a' a 'z'), escolher a palavra que dá maior economia
            Map<Character, String> melhorAbrev = new TreeMap<>();
            for (char c = 'a'; c <= 'z'; c++) {
                int maxEconomia = 0;
                String melhorPalavra = null;

                for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                    String p = entry.getKey();
                    if (p.charAt(0) == c) {
                        int economia = entry.getValue() * (p.length() - 2);
                        if (economia > maxEconomia) {
                            maxEconomia = economia;
                            melhorPalavra = p;
                        }
                    }
                }

                if (melhorPalavra != null && maxEconomia > 0) {
                    melhorAbrev.put(c, melhorPalavra);
                }
            }

            StringBuilder textoAbreviado = new StringBuilder();
            for (int i = 0; i < palavras.length; i++) {
                if (i > 0) textoAbreviado.append(" ");
                String p = palavras[i];
                if (p.length() > 2 && melhorAbrev.containsKey(p.charAt(0)) && melhorAbrev.get(p.charAt(0)).equals(p)) {
                    textoAbreviado.append(p.charAt(0)).append(".");
                } else {
                    textoAbreviado.append(p);
                }
            }

            System.out.println(textoAbreviado.toString());
            System.out.println(melhorAbrev.size());
            for (Map.Entry<Character, String> entry : melhorAbrev.entrySet()) {
                System.out.println(entry.getKey() + ". = " + entry.getValue());
            }
        }
    }
}