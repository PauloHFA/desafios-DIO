// Exchanging Cards

/*
Desafio:
Alice e Betty colecionam cartas de Pokémon. Cada carta possui um identificador único inteiro.
Elas desejam trocar cartas sem repetir cartas que já possuem e sem receber repetidas.
A troca é feita em uma única operação: Alice dá N cartas distintas para Betty e recebe N
cartas distintas de volta.
Calcule o número máximo de cartas que elas podem trocar entre si.

Entrada:
A entrada contém vários casos de teste. A primeira linha contém A e B (número de cartas de
Alice e Betty). A segunda linha contém as cartas de Alice. A terceira linha contém as cartas
de Betty. O fim da entrada é indicado por A = 0 e B = 0.

Saída:
Para cada caso de teste, imprima o número máximo de cartas que podem ser trocadas.
*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExchangingCards {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            Set<Integer> cartasAlice = new HashSet<>();
            for (int i = 0; i < a; i++) {
                cartasAlice.add(sc.nextInt());
            }

            Set<Integer> cartasBetty = new HashSet<>();
            for (int i = 0; i < b; i++) {
                cartasBetty.add(sc.nextInt());
            }

            int apenasAlice = 0;
            for (int carta : cartasAlice) {
                if (!cartasBetty.contains(carta)) {
                    apenasAlice++;
                }
            }

            int apenasBetty = 0;
            for (int carta : cartasBetty) {
                if (!cartasAlice.contains(carta)) {
                    apenasBetty++;
                }
            }

            System.out.println(Math.min(apenasAlice, apenasBetty));
        }

        sc.close();
    }
}
