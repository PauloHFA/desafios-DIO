// Entrevista Embaraçosa

/*
A estagiária gaguejou e repetiu o final de algumas palavras na entrevista.
Sua tarefa é verificar se o final da palavra foi repetido e imprimir a palavra original.

Entrada
Vários casos de teste terminando com EOF.

Saída
A palavra sem a repetição no final. Se houver mais de uma possibilidade, imprima todas.
Se não houver repetição, imprima a própria palavra.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palavra;

        while ((palavra = br.readLine()) != null) {
            palavra = palavra.trim();
            if (palavra.isEmpty()) continue;

            boolean achou = false;
            for (int i = 0; i <= palavra.length() - 1; i++) {
                String prefixo = palavra.substring(0, i);
                String sufixo = palavra.substring(i);
                if (!sufixo.isEmpty() && prefixo.endsWith(sufixo)) {
                    System.out.println(prefixo);
                    achou = true;
                }
            }

            if (!achou) {
                System.out.println(palavra);
            }
        }
    }
}