// A Mensagem do padre do balão

/*
Dada a string com as 26 letras do alfabeto e a ordem das lâmpadas piscadas, decifre a mensagem.

Entrada
Vários casos de teste com uma string de 26 letras, N (lâmpadas) e os N inteiros.

Saída
A mensagem decifrada.
*/

import java.io.IOException;
import java.util.Scanner;

public class AMensagemDoPadreDoBalao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String alphabet = leitor.next();
            int n = leitor.nextInt();
            StringBuilder word = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int index = leitor.nextInt() - 1;
                word.append(alphabet.charAt(index));
            }
            System.out.println(word.toString());
        }
        leitor.close();
    }
}