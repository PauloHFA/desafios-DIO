// Validador de Senhas

/*
A senha deve conter:
- Entre 6 e 32 caracteres;
- Pelo menos uma maiúscula, uma minúscula e um número;
- Nenhum caractere especial, espaço ou pontuação.

Entrada
Vários casos de teste terminando em EOF.

Saída
"Senha valida." ou "Senha invalida.".
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidadorDeSenhas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;

        while ((password = br.readLine()) != null) {
            if (password.length() < 6 || password.length() > 32) {
                System.out.println("Senha invalida.");
                continue;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean validChars = true;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else {
                    validChars = false;
                    break;
                }
            }

            if (validChars && hasUpper && hasLower && hasDigit) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}