// Gincana no Acampamento

/*
Alunos em círculo eliminados alternadamente de acordo com o número da ficha
(par no sentido horário, ímpar no sentido anti-horário).

Entrada
Vários casos de teste terminando com N = 0.

Saída
"Vencedor(a): xxxxxx".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaNoAcampamento {
    static class Aluno {
        String nome;
        int valor;
        Aluno(String nome, int valor) {
            this.nome = nome;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        while (scr.hasNextInt()) {
            int n = scr.nextInt();
            if (n == 0) break;

            List<Aluno> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nome = scr.next();
                int valor = scr.nextInt();
                lista.add(new Aluno(nome, valor));
            }

            int indiceAtual = 0;
            int valorFicha = lista.get(indiceAtual).valor;

            while (lista.size() > 1) {
                int tam = lista.size();
                int indiceEliminado;

                if (valorFicha % 2 == 0) {
                    indiceEliminado = (tam - (valorFicha % tam) + indiceAtual) % tam;
                } else {
                    indiceEliminado = (valorFicha % tam + indiceAtual) % tam;
                }

                valorFicha = lista.get(indiceEliminado).valor;
                lista.remove(indiceEliminado);

                if (valorFicha % 2 == 0) {
                    indiceAtual = (indiceEliminado <= lista.size() - 1) ? indiceEliminado : 0;
                } else {
                    indiceAtual = (indiceEliminado == 0) ? lista.size() - 1 : indiceEliminado - 1;
                }
            }

            System.out.println("Vencedor(a): " + lista.get(0).nome);
        }
        scr.close();
    }
}