// Tipo de Combustível

/*
Desafio:
Você recebeu o desafio para determinar qual dos produtos é o preferencial dos clientes
de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo
para ler o tipo de combustível abastecido:
1. Álcool
2. Gasolina
3. Diesel
4. Fim

Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um
novo código (até que seja válido). O programa será encerrado quando o código informado
for o número 4.

Entrada:
A entrada contém apenas valores inteiros e positivos.

Saída:
Deve ser impressa a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível.
*/

import java.io.IOException;
import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while (sc.hasNextInt()) {
            int combustivel = sc.nextInt();
            
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else if (combustivel == 3) {
                diesel++;
            } else if (combustivel == 4) {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
