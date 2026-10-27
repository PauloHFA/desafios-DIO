// Reservatório de Mel

/*
Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba. Todo ano, semestralmente, seu Júlio coleta o mel produzido pelas abelhas da sua propriedade e armazena-o em um recipiente de formato CILÍNDRICO para que facilite o transporte do mel para os estabelecimentos que encomendam esse produto natural para a comercialização.
Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, em relação ao semestre anterior, o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas. Seu Júlio precisa agora que você faça um programa que informado o volume de mel em cm3 e o diâmetro da parte interna do recipiente em cm, calcule e mostre:
- Qual deve ser a altura(em cm) da parte interna do recipiente;
- A área(em cm2) da boca(entrada) do recipiente.
Obs.: Considere PI = 3.14

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de duas linhas contendo em cada uma um valor de ponto flutuante de dupla precisão com duas casas decimais após a vírgula, sendo um V e outro D.

Saída
Para cada teste, a saída contém na primeira linha a mensagem "ALTURA = ", seguida do valor com duas casas decimais e na segunda linha a mensagem "AREA = ", também com duas casas decimais.
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ReservatorioDeMel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        while (leitor.hasNextDouble()) {
            double v = leitor.nextDouble();
            if (!leitor.hasNextDouble()) break;
            double d = leitor.nextDouble();
            double r = d / 2.0;
            double area = 3.14 * r * r;
            double altura = v / area;

            System.out.printf(Locale.US, "ALTURA = %.2f\n", altura);
            System.out.printf(Locale.US, "AREA = %.2f\n", area);
        }
        leitor.close();
    }
}