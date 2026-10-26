// Fases da Lua

/*
Desafio:
Jade ganhou de presente de aniversário um telescópio e ficou muito feliz,
pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa, e só
analisando a lua por duas noites seguidas, já consegue identificar as mudanças
que ocorreram na iluminação e o percentual aproximado da lua que está iluminada.

Regras:
- Se a porção visível da lua no momento (noite anterior / fim) estiver entre 0 e 2% -> "nova"
- Se estiver entre 97 e 100% -> "cheia"
- Se estiver entre 3 e 96% e aumentando (fim > inicio) -> "crescente"
- Se estiver entre 3 e 96% e diminuindo (fim <= inicio) -> "minguante"

Entrada:
A entrada é composta por uma única linha contendo dois valores inteiros:
o percentual de dois dias atrás (inicio) e o percentual da noite anterior (fim).

Saída:
Imprima a fase correspondente na noite anterior: "nova", "crescente", "cheia" ou "minguante".
*/

import java.util.Scanner;

public class FasesDaLua {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
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
        
        leitor.close();
    }
}
