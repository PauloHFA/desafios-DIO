// Validador de Senhas com requisitos

/*
Desafio
Pedro e Fernando estão desenvolvendo um sistema e precisam de um validador de senhas.
A senha deve conter:
- Entre 6 e 32 caracteres;
- Pelo menos uma letra maiúscula, uma minúscula e um número;
- Não conter nenhum caractere de pontuação, acentuação ou espaço em branco.

Entrada
A entrada contém vários casos de teste e termina com fim de arquivo (EOF).

Saída
Para cada caso de teste, imprima "Senha valida." se a senha atender aos requisitos,
ou "Senha invalida." caso contrário.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidadorDeSenhasComRequisitos {
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