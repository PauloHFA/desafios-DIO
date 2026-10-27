import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProdutoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            scanner.close();
            return;
        }

        String firstLine = scanner.nextLine().trim();
        while (firstLine.isEmpty() && scanner.hasNextLine()) {
            firstLine = scanner.nextLine().trim();
        }
        if (firstLine.isEmpty()) {
            scanner.close();
            return;
        }

        int n = Integer.parseInt(firstLine);
        BigDecimal resultNum = new BigDecimal("1.0");

        for (int i = 0; i < n; ++i) {
            String line = scanner.nextLine().trim();
            while (line.isEmpty() && scanner.hasNextLine()) {
                line = scanner.nextLine().trim();
            }
            String[] lineArgs = line.split("\\s+");
            BigDecimal currentNum = new BigDecimal(lineArgs[0]);
            String operator = lineArgs[1];

            if (operator.equals("*")) {
                resultNum = resultNum.multiply(currentNum);
            } else if (operator.equals("/")) {
                resultNum = resultNum.divide(currentNum, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultNum.setScale(0, RoundingMode.DOWN));
        scanner.close();
    }
}