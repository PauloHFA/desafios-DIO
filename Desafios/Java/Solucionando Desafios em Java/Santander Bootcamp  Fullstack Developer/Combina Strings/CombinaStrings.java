// Combina Strings

import java.io.IOException;
import java.util.Scanner;

public class CombinaStrings {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = Integer.parseInt(leitor.nextLine().trim());
            for (int i = 0; i < n; i++) {
                String linha = leitor.nextLine().trim();
                String[] partes = linha.split("\\s+");
                String s1 = partes[0];
                String s2 = partes.length > 1 ? partes[1] : "";

                StringBuilder sb = new StringBuilder();
                int max = Math.max(s1.length(), s2.length());
                for (int j = 0; j < max; j++) {
                    if (j < s1.length()) sb.append(s1.charAt(j));
                    if (j < s2.length()) sb.append(s2.charAt(j));
                }
                System.out.println(sb.toString());
            }
        }
        leitor.close();
    }
}