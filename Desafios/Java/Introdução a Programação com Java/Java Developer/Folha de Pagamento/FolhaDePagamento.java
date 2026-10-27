// Folha de Pagamento

/*
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores.
Calcule o salário e apresente com duas casas decimais.

Entrada
Você receberá 2 números inteiros e 1 número com duas casas decimais.

Saída
Exiba o número e o salário do colaborador.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextInt()) {
            int numColaborador = leitor.nextInt();
            int horasTrabalhadas = leitor.nextInt();
            double valorHora = leitor.nextDouble();

            double salario = horasTrabalhadas * valorHora;
            System.out.println("NUMBER = " + numColaborador);
            System.out.printf(Locale.US, "SALARY = U$ %.2f\n", salario);
        }
        leitor.close();
    }
}