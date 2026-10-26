// Copa

/*
Desafio:
Dadas as posições de Mestre Kung (K) e Mestre Lu (L) na chave de 16 posições de um torneio
eliminatório de ping-pong, decidir em qual fase eles vão se enfrentar:
"oitavas", "quartas", "semifinal" ou "final".

Entrada:
A entrada consiste de duas linhas:
K (1 <= K <= 16)
L (1 <= L <= 16, K != L)

Saída:
Uma linha com o nome da fase: "oitavas", "quartas", "semifinal" ou "final".
*/

import java.io.IOException;
import java.util.Scanner;

public class Copa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt() - 1;
        int l = sc.nextInt() - 1;
        
        if (k / 2 == l / 2) {
            System.out.println("oitavas");
        } else if (k / 4 == l / 4) {
            System.out.println("quartas");
        } else if (k / 8 == l / 8) {
            System.out.println("semifinal");
        } else {
            System.out.println("final");
        }
        
        sc.close();
    }
}
