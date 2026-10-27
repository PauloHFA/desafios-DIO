// Média 2

/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextDouble()) {
            double a = leitor.nextDouble();
            double b = leitor.nextDouble();
            double c = leitor.nextDouble();
            double media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0;
            System.out.printf(Locale.US, "MEDIA = %.1f\n", media);
        }

        leitor.close();
    }
}
