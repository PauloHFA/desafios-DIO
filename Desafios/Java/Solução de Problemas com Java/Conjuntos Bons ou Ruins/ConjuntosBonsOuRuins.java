import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

            List<String> conjunto = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                conjunto.add(br.readLine().trim());
            }

            Collections.sort(conjunto);
            boolean ruim = false;
            for (int i = 0; i < n - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
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