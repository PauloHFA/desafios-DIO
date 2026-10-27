// Combinação de Strings

/*
Crie um algoritmo que receba dois valores String e retorne uma nova String
com os caracteres combinados alternadamente.

Entrada
A primeira linha contém N. Seguem N linhas com duas strings cada.

Saída
A cadeia combinada de cada caso.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CombinacaoDeStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaN = br.readLine();
        if (linhaN != null && !linhaN.trim().isEmpty()) {
            int n = Integer.parseInt(linhaN.trim());
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                if (line == null) break;
                String[] partes = line.trim().split("\\s+");
                String s1 = partes[0];
                String s2 = partes.length > 1 ? partes[1] : "";

                StringBuilder sb = new StringBuilder();
                int maxLen = Math.max(s1.length(), s2.length());

                for (int j = 0; j < maxLen; j++) {
                    if (j < s1.length()) sb.append(s1.charAt(j));
                    if (j < s2.length()) sb.append(s2.charAt(j));
                }
                System.out.println(sb.toString());
            }
        }
    }
}