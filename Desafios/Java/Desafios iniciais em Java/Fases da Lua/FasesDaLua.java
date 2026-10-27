// Fases da Lua

/*
Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa, e só analizando a lua por duas noites seguidas, já consegue identificar as fases da lua, como: Nova, Crescente, Cheia, Minguante.
Ela sabe que se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova, se for entre 3 e 96% é lua crescente, se for entre 97 e 100% é lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.
Você que é amigo de Jade e sabe que ela adora programar, resolveu fazer um pequeno programa que, baseado nessa tabela simples que ela fez, informe a fase da lua que ela está observando.

Entrada
A entrada é composta por uma única linha contendo dois valores inteiros. O primeiro valor corresponde ao percentual observado por Jade na noite de dois dias atrás. O segundo valor corresponde ao percentual observado por Jade na noite anterior.

Saída
Baseado nos dois percentuais observados por Jade, imprima na tela a fase da lua que Jade observou na noite anterior, sendo que as opções são: "nova", "crescente", "cheia", "minguante".
*/

import java.util.Scanner;

public class FasesDaLua {
    public static void main(String[] args) {
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
