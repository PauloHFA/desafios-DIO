// Par ou Ímpar

/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-10^7 < X < 10^7).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.

Exemplo de Entrada
4
-5
0
3
-4

Exemplo de Saída
ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE
*/

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int N = leitor.nextInt();
            for (int i = 0; i < N; i++) {
                int x = leitor.nextInt();
                if (x == 0) {
                    System.out.println("NULL");
                } else {
                    String paridade = (x % 2 == 0) ? "EVEN" : "ODD";
                    String sinal = (x > 0) ? "POSITIVE" : "NEGATIVE";
                    System.out.println(paridade + " " + sinal);
                }
            }
        }
        leitor.close();
    }
}
