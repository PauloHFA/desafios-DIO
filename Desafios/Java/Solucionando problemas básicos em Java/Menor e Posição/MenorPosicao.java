import java.util.Scanner;

public class MenorPosicao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int menor = Integer.MAX_VALUE;
            int posMenor = 0;

            for (int i = 0; i < n; i++) {
                int val = leitor.nextInt();
                if (i == 0 || val < menor) {
                    menor = val;
                    posMenor = i;
                }
            }

            System.out.println("Menor valor: " + menor);
            System.out.println("Posicao: " + posMenor);
        }
        leitor.close();
    }
}