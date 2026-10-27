// Atalhos para o Weblogger Brasil

/*
Você está ajudando a desenvolver um sistema de gerenciamento de conteúdo para blogs chamado Weblogger Brasil.
Cada vez que uma tag _ (itálico) ou * (negrito) aparece no texto, ela deve ser substituída pela tag HTML correspondente.
A primeira ocorrência abre a formatação (<i> ou <b>) e a segunda fecha (</i> ou </b>).

Entrada
O arquivo de entrada contém vários casos de teste e termina com fim de arquivo (EOF).

Saída
Para cada caso de teste, imprima a linha com as tags HTML correspondentes.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AtalhosParaOWebloggerBrasil {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null) {
            boolean inItalic = false;
            boolean inBold = false;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '_') {
                    sb.append(inItalic ? "</i>" : "<i>");
                    inItalic = !inItalic;
                } else if (c == '*') {
                    sb.append(inBold ? "</b>" : "<b>");
                    inBold = !inBold;
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}