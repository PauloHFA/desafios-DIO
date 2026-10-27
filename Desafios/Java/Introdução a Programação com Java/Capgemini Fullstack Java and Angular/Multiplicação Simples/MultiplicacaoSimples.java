// Multiplicação Simples

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule
o produto entre estes dois valores. Atribua esta operação à variável PROD.

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo um espaço em branco antes e depois da igualdade.
*/

import java.io.IOException;
import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("PROD = " + (a * b));
        }
        sc.close();
    }
}