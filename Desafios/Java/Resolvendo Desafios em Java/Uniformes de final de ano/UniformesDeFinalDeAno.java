// Uniformes de Final de Ano

/*
Organizar listas de uniformes:
1. Cor em ordem ascendente ("branco" antes de "vermelho")
2. Tamanho em ordem descendente ("P", "M", "G")
3. Nome em ordem ascendente

Entrada
Vários casos de teste com N (1 <= N <= 60), terminando com N = 0.

Saída
Lista ordenada.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniformesDeFinalDeAno {
    static class Camiseta implements Comparable<Camiseta> {
        String nome;
        String cor;
        String tamanho;

        Camiseta(String nome, String cor, String tamanho) {
            this.nome = nome;
            this.cor = cor;
            this.tamanho = tamanho;
        }

        @Override
        public int compareTo(Camiseta o) {
            int corComp = this.cor.compareTo(o.cor);
            if (corComp != 0) return corComp;

            int tamComp = o.tamanho.compareTo(this.tamanho); // 'P', 'M', 'G'
            if (tamComp != 0) return tamComp;

            return this.nome.compareTo(o.nome);
        }

        @Override
        public String toString() {
            return cor + " " + tamanho + " " + nome;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            int n = Integer.parseInt(line);
            if (n == 0) break;

            List<Camiseta> camisetas = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nome = br.readLine();
                String[] info = br.readLine().trim().split("\\s+");
                camisetas.add(new Camiseta(nome, info[0], info[1]));
            }

            Collections.sort(camisetas);
            for (Camiseta c : camisetas) {
                System.out.println(c);
            }
        }
    }
}