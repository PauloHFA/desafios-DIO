// A Mudança Continua!!

/*
Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu
programa anterior só informava uma saudação, ele pediu que transformasse o grau
do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo à posição do
Sol/Lua, refaça o sistema só que agora além da saudação de cada período do dia,
informe exatamente as horas, os minutos e segundos.

Entrada:
A entrada contém um ponto flutuante M (0 <= M < 360) representando a posição,
em graus, do Sol/Lua em relação à Terra. Como eles andam em constante movimento,
seu programa receberá diversos casos a cada segundo (EOF).

Saída:
Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!",
"Bom Dia!!" e "De Madrugada!!", e na linha de baixo exiba as horas, minutos e
segundos (HH:MM:SS).
*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AMudancaContinua {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        while (leitor.hasNextDouble()) {
            double graus = leitor.nextDouble();
            
            if (graus <= 360) {
                if (graus < 90 || graus == 360) {
                    System.out.println("Bom Dia!!");
                } else if (graus < 180) {
                    System.out.println("Boa Tarde!!");
                } else if (graus < 270) {
                    System.out.println("Boa Noite!!");
                } else {
                    System.out.println("De Madrugada!!");
                }
                
                // Conversão de graus para segundos a partir das 06:00:00 (1 grau = 240 segundos)
                int totalSegundos = (int) Math.round((6 * 3600) + (graus * 240.0)) % 86400;
                int horas = totalSegundos / 3600;
                int minutos = (totalSegundos % 3600) / 60;
                int segundos = totalSegundos % 60;
                
                System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
            }
        }
        
        leitor.close();
    }
}
