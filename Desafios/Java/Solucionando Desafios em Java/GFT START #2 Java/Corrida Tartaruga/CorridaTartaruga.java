// Corrida de Tartarugas

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CorridaTartaruga {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            int n = Integer.parseInt(line);

            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxV = 0;
            for (int i = 0; i < n; i++) {
                int v = Integer.parseInt(st.nextToken());
                if (v > maxV) maxV = v;
            }

            if (maxV < 10) {
                System.out.println(1);
            } else if (maxV < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}