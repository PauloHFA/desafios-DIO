// Encontre a maior substring

/*
Encontre a maior substring comum entre as duas strings informadas.

Entrada
A entrada contém vários casos de teste terminando em EOF. Cada caso é composto por 2 linhas.

Saída
O comprimento da maior substring comum entre as duas strings.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EncontreAMaiorSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1;

        while ((s1 = reader.readLine()) != null) {
            String s2 = reader.readLine();
            if (s2 == null) break;

            String min = s1.length() <= s2.length() ? s1 : s2;
            String max = s1.length() > s2.length() ? s1 : s2;

            int maxLen = 0;
            int minLen = min.length();

            for (int len = minLen; len >= 1; len--) {
                boolean found = false;
                for (int i = 0; i <= minLen - len; i++) {
                    String sub = min.substring(i, i + len);
                    if (max.contains(sub)) {
                        maxLen = len;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            System.out.println(maxLen);
        }
    }
}