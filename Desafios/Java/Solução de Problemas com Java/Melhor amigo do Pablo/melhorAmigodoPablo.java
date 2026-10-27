import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MelhorAmigoDoPablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> alunosAmigos = new TreeSet<>();
        Set<String> alunosNaoAmigos = new TreeSet<>();
        String vencedor = "";

        while (sc.hasNextLine()) {
            String entrada = sc.nextLine().trim();
            if (entrada.equals("FIM") || entrada.isEmpty()) break;
            String[] parts = entrada.split("\\s+");
            if (parts.length < 2) continue;
            String nomeAluno = parts[0];
            String opcao = parts[1];

            if ("SIM".equalsIgnoreCase(opcao)) {
                alunosAmigos.add(nomeAluno);
                if (nomeAluno.length() > vencedor.length()) {
                    vencedor = nomeAluno;
                }
            } else {
                alunosNaoAmigos.add(nomeAluno);
            }
        }

        for (String aluno : alunosAmigos) {
            System.out.println(aluno);
        }
        for (String aluno : alunosNaoAmigos) {
            System.out.println(aluno);
        }
        System.out.println();
        System.out.println("Amigo do Pablo:");
        System.out.println(vencedor);
        sc.close();
    }
}