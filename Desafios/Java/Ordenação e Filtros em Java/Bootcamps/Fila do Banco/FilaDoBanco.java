// Fila do Banco

/*
Dada a ordem de chegada dos clientes, reordene a fila de acordo com o número do SMS
(maiores números primeiro) e informe quantos clientes não precisaram trocar de lugar.

Entrada
A primeira linha contém um inteiro N (casos de teste).
Cada caso inicia com um inteiro M (número de clientes), seguido de M inteiros distintos.

Saída
Para cada caso imprima quantos clientes não trocaram de lugar após a ordenação decrescente.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaDoBanco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linhaN = br.readLine();
        if (linhaN != null && !linhaN.trim().isEmpty()) {
            int n = Integer.parseInt(linhaN.trim());
            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(br.readLine().trim());
                String[] partes = br.readLine().trim().split("\\s+");
                List<Integer> original = Arrays.stream(partes).map(Integer::parseInt).collect(Collectors.toList());
                List<Integer> ordenado = original.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

                int naoMudou = 0;
                for (int j = 0; j < m; j++) {
                    if (original.get(j).equals(ordenado.get(j))) {
                        naoMudou++;
                    }
                }
                System.out.println(naoMudou);
            }
        }
    }
}