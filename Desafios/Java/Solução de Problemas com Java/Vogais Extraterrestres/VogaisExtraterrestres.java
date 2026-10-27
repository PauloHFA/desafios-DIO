import java.util.Scanner;

public class VogaisExtraterrestres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String vogais = sc.nextLine();
            if (!sc.hasNextLine()) break;
            String frase = sc.nextLine();

            int countVogais = 0;
            for (char v : vogais.toCharArray()) {
                for (char c : frase.toCharArray()) {
                    if (c == v) {
                        countVogais++;
                    }
                }
            }
            System.out.println(countVogais);
        }
        sc.close();
    }
}