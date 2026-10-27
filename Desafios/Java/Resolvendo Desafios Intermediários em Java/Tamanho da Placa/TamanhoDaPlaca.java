// Tamanho da Placa

/*
Verificar se o circuito cabe na placa da empresa.

Entrada
Linha com X, Y e M. Seguem M linhas com Xi e Yi.

Saída
"Sim" ou "Nao" para cada circuito.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TamanhoDaPlaca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int i = 0; i < m; i++) {
                String subLine = br.readLine();
                if (subLine == null) break;
                st = new StringTokenizer(subLine.trim());
                int xi = Integer.parseInt(st.nextToken());
                int yi = Integer.parseInt(st.nextToken());

                if ((xi <= x && yi <= y) || (yi <= x && xi <= y)) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }
            }
        }
    }
}