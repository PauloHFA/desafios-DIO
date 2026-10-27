// Validação de Nota

/*
Calcular a média semestral referente a duas notas válidas (entre 0 e 10).
Cada nota deve ser validada separadamente.

Entrada
Vários valores reais. O programa encerra após duas notas válidas.

Saída
"nota invalida" para notas inválidas.
"media = X.XX" para a média das duas notas.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int validas = 0;
        double soma = 0;

        while (validas < 2 && entrada.hasNextDouble()) {
            double n = entrada.nextDouble();
            if (n >= 0.0 && n <= 10.0) {
                soma += n;
                validas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        if (validas == 2) {
            double media = soma / 2.0;
            System.out.printf(Locale.US, "media = %.2f\n", media);
        }
        entrada.close();
    }
}