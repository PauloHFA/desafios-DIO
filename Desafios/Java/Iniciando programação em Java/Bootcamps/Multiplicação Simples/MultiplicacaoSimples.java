// Multiplicação Simples

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule
o produto entre estes dois valores. Atribua esta operação à variável PROD,
mostrando está de acordo com a mensagem de saída esperada.

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um
espaço em branco antes e depois da igualdade.
*/

import java.io.IOException;
import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a * b;
            System.out.println("PROD = " + total);
        }
        sc.close();
    }
}