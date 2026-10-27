// Trigo no Tabuleiro

/*
Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de alimentos, perguntou a rainha se o pagamento poderia ser feito em grãos de trigo dispostos em um tabuleiro de damas, de forma que o primeiro quadrado tivesse apenas um grão, e os quadrados subseqüentes, o dobro do quadrado anterior. A rainha considerou o pagamento barato e pediu que o serviço fosse executado, porém, um dos cavaleiros que estava presente e entendia um pouco de matemática alertou-a que seria impossível executar o pagamento, pois a quantidade de grãos seria muito alta. Curiosa, a rainha solicitou então a este cavaleiro que era bom em cálculo, que fizesse um programa que recebesse como entrada o número de quadrados a serem usados em um tabuleiro de damas e apresentasse a quantidade de kg de trigo correspondente, sabendo que cada 12 grãos do cereal correspondem a uma grama. Finalmente, o cálculo da quantidade deverá caber em um valor inteiro de 64 bits sem sinal.

Entrada
A primeira linha de entrada contém um único inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste. Cada caso de teste contém um único inteiro X (1 ≤ X ≤ 64), indicando o número de casas do tabuleiro que serão utilizadas.

Saída
Para cada caso de teste, imprima a quantidade de kgs de trigo que o monge esperava receber.

Exemplo de Entrada
3
7
19
14

Exemplo de Saída
0 kg
43 kg
1 kg
*/

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class TrigoNoTabuleiro {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            BigInteger dois = BigInteger.valueOf(2);
            BigInteger divisor = BigInteger.valueOf(12000); // 12 grãos = 1g -> 12000 grãos = 1kg

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                BigInteger totalGraos = dois.pow(x).subtract(BigInteger.ONE);
                BigInteger kg = totalGraos.divide(divisor);
                System.out.println(kg + " kg");
            }
        }
        sc.close();
    }
}
