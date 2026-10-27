// Idades

/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.

Exemplo de Entrada	
34
56
44
23
-2

Exemplo de Saída
39.25
*/

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n;
        double soma = 0;

        while (leitor.hasNextInt()) {
            n = leitor.nextInt();
            if (n < 0) {
                break;
            }
            soma += n;
            cont++;
        }

        if (cont > 0) {
            double media = soma / cont;
            System.out.println(String.format(Locale.US, "%.2f", media));
        }

        leitor.close();
    }
}
