// Programa para Validação de Notas

/*
Desafio:
Desenvolva um programa que leia as notas da primeira e da segunda avaliação de um aluno.
Calcule e imprima a média semestral. O programa só aceitará notas válidas (uma nota
válida deve pertencer ao intervalo [0, 10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem "novo calculo (1-sim 2-nao)", solicitando que
informe um código (1 ou 2) indicando se deseja ou não executar o algoritmo novamente.
Se for informado o código 1 deve ser repetida a execução de todo o programa.
Se for informado 2 o programa deve ser encerrado. Se for informado qualquer outro
valor, deve-se repetir a pergunta.

Entrada:
O arquivo de entrada contém vários valores reais (notas) e inteiros (opções de repetição).

Saída:
Se uma nota inválida for lida, imprima "nota invalida".
Quando duas notas válidas forem lidas, imprima "media = " seguido da média com duas casas decimais.
Imprima "novo calculo (1-sim 2-nao)" conforme as regras de repetição.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaParaValidacaoDeNotas {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            double soma = 0.0;
            int notasValidas = 0;

            while (notasValidas < 2 && leitor.hasNextDouble()) {
                double nota = leitor.nextDouble();

                if (nota >= 0.0 && nota <= 10.0) {
                    soma += nota;
                    notasValidas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            if (notasValidas == 2) {
                double media = soma / 2.0;
                System.out.printf(Locale.US, "media = %.2f%n", media);

                int opcao = 0;
                while (opcao != 1 && opcao != 2) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    if (leitor.hasNextInt()) {
                        opcao = leitor.nextInt();
                    } else if (leitor.hasNextDouble()) {
                        opcao = (int) leitor.nextDouble();
                    } else {
                        break;
                    }
                }

                if (opcao == 2) {
                    continuar = false;
                }
            } else {
                break;
            }
        }

        leitor.close();
    }
}
