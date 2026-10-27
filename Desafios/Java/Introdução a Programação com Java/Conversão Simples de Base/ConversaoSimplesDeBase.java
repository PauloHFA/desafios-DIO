// Conversão Simples de Base

/*
Neste problema você é solicitado a escrever um simples programa de conversão de base.
A entrada será um valor hexadecimal ou decimal. Se o valor for hexadecimal, você deve convertê-lo
para decimal e vice-versa. O valor hexadecimal inicia sempre com 0x ou 0X.
Um número negativo indica o encerramento do programa.

Entrada
A entrada contém vários casos de teste.

Saída
Para cada linha de entrada imprima o valor convertido correspondente.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConversaoSimplesDeBase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (linha.startsWith("-")) break;

            if (linha.startsWith("0x") || linha.startsWith("0X")) {
                String hex = linha.substring(2);
                long dec = Long.parseLong(hex, 16);
                System.out.println(dec);
            } else {
                long val = Long.parseLong(linha);
                String hex = Long.toHexString(val).toUpperCase();
                System.out.println("0x" + hex);
            }
        }
    }
}