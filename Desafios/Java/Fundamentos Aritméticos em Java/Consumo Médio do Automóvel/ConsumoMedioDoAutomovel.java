// Consumo Médio do Automóvel

/*
Você deve calcular o consumo médio de um automóvel onde será informada a
distância total percorrida (em Km) e o total de combustível consumido (em
litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida
(em Km), e um valor real Y que representa o total de combustível consumido, com
um dígito após o ponto decimal.

Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a
vírgula), incluindo no final a mensagem "km/l".
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        if (leitor.hasNextInt()) {
            int distancia = leitor.nextInt();
            double combustivel = leitor.nextDouble();
            double consumoMedio = distancia / combustivel;
            System.out.printf(Locale.US, "%.3f km/l\n", consumoMedio);
        }
        leitor.close();
    }
}