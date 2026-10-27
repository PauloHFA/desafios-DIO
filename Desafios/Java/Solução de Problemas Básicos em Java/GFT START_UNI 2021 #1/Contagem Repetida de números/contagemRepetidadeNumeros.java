import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            Map<Integer, Integer> freq = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (scan.hasNextInt()) {
                    int val = scan.nextInt();
                    freq.put(val, freq.getOrDefault(val, 0) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
            }
        }
        scan.close();
    }
}