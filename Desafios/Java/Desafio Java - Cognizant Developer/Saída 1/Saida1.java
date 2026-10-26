// Saída 1

/*
Desafio:
O seu instrutor de lógica de programação quer que você desenvolva uma tela
com as seguintes características:
1. Conter 39 traços horizontais ( - ) na primeira linha;
2. Conter um traço vertical ( | ) embaixo do primeiro traço e do trigésimo nono traço
   da primeira linha, preencher no meio com 37 espaços em branco;
3. Repita o procedimento 2 cinco vezes;
4. Repita o procedimento 1.

Entrada:
Não há entrada.

Saída:
A saída deve ser impressa exatamente no formato da moldura descrita.
*/

public class Saida1 {
    public static void main(String[] args) {
        // Linha superior: 39 traços
        System.out.println("---------------------------------------");

        // 5 linhas com paredes laterais e 37 espaços
        for (int i = 0; i < 5; i++) {
            System.out.println("|                                     |");
        }

        // Linha inferior: 39 traços
        System.out.println("---------------------------------------");
    }
}
