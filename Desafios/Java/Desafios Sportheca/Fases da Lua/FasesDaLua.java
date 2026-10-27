// Fases da Lua

/*
Desafio
Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. Ela sempre foi uma aluna muito boa, e só pelo fato de olhar a lua ela na mesma hora já sabe qual é a sua fase. Pensando em ajudar seus colegas da escola, sua tarefa é desenvolver um programa que, baseado em duas medições da parte visível da lua, informe a fase em que ela se encontra.

Entrada
A entrada é composta por uma única linha contendo dois valores inteiros com os percentuais das duas últimas medições.

Saída
Baseado nos dois percentuais, imprima na tela a fase em que a lua se encontra: "nova" (0% a 2%), "crescente" (3% a 96% subindo), "cheia" (97% a 100%) ou "minguante" (96% a 3% descendo).
*/

import java.io.IOException;
import java.util.Scanner;

public class FasesDaLua {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int inicio = leitor.nextInt();
            int fim = leitor.nextInt();

            if (fim >= 0 && fim <= 2) {
                System.out.println("nova");
            } else if (fim >= 97 && fim <= 100) {
                System.out.println("cheia");
            } else if (fim > inicio) {
                System.out.println("crescente");
            } else {
                System.out.println("minguante");
            }
        }
        leitor.close();
    }
}