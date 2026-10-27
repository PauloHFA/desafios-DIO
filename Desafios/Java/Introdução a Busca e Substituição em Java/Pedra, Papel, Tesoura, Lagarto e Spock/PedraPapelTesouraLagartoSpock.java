// Pedra, Papel, Tesoura, Lagarto e Spock

/*
Desafio
Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção.
As regras de desacordo são:
- a tesoura corta o papel;
- o papel embrulha a pedra;
- a pedra esmaga o lagarto;
- o lagarto envenena o Spock;
- o Spock destrói a tesoura;
- a tesoura decapita o lagarto;
- o lagarto come o papel;
- o papel refuta o Spock;
- o Spock vaporiza a pedra;
- a pedra amassa a tesoura.

Entrada
A primeira linha contém o número de casos de teste. Cada caso de teste consiste em dois nomes:
a escolha de Fernanda e a escolha de Marcia.

Saída
Para cada caso de teste, imprima quem venceu ("fernanda", "marcia") ou "empate".
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PedraPapelTesouraLagartoSpock {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<String> fernandaVence = new HashSet<>(Arrays.asList(
            "tesoura papel", "papel pedra", "pedra lagarto", "lagarto spock", "spock tesoura",
            "tesoura lagarto", "lagarto papel", "papel spock", "spock pedra", "pedra tesoura"
        ));

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String f = sc.next().toLowerCase();
                String m = sc.next().toLowerCase();

                if (f.equals(m)) {
                    System.out.println("empate");
                } else if (fernandaVence.contains(f + " " + m)) {
                    System.out.println("fernanda");
                } else {
                    System.out.println("marcia");
                }
            }
        }
        sc.close();
    }
}