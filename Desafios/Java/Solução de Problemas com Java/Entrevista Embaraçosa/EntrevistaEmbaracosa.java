import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palavra;

        while ((palavra = br.readLine()) != null) {
            palavra = palavra.trim();
            if (palavra.isEmpty()) continue;

            boolean encontrouRepeticao = false;
            for (int i = 0; i <= palavra.length() - 1; i++) {
                if (palavra.substring(0, i).endsWith(palavra.substring(i))) {
                    System.out.println(palavra.substring(0, i));
                    encontrouRepeticao = true;
                }
            }
            if (!encontrouRepeticao) {
                System.out.println(palavra);
            }
        }
    }
}