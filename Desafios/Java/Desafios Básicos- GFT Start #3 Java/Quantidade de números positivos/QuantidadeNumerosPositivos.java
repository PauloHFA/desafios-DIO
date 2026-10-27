// Quantidade de Números Positivos

/*
Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em
seguida, apresente a quantidade de valores positivos digitados.

- Entrada

Você receberá seis valores, negativos e/ou positivos.

- Saída

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
ao final.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int positivos = 0;
        
        for (int i = 0; i < 6; i++) {
            String linha = br.readLine();
            if (linha != null && !linha.trim().isEmpty()) {
                double n = Double.parseDouble(linha.trim());
                if (n > 0.0) {
                    positivos++;
                }
            }
        }

        System.out.println(positivos + " valores positivos");
    }
}
