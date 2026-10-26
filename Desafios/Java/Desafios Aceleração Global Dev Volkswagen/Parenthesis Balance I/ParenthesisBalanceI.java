// Parenthesis Balance I

/*
Desafio:
Dada uma expressão matemática com parênteses, verifique se a quantidade e ordem
dos parênteses estão corretas ("correct") ou incorretas ("incorrect").
Cada parêntese aberto '(' deve ter seu correspondente fechado ')' na ordem correta.

Entrada:
Várias expressões (termina com EOF).

Saída:
"correct" ou "incorrect" para cada caso de teste.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParenthesisBalanceI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = reader.readLine()) != null) {
            int balance = 0;
            boolean ok = true;
            
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(') {
                    balance++;
                } else if (c == ')') {
                    balance--;
                    if (balance < 0) {
                        ok = false;
                        break;
                    }
                }
            }
            
            if (ok && balance == 0) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
