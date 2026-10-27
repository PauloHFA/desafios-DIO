import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BarrasDeOuro {
    static int cargoCapacity;

    static class Node {
        Fief destinationFief;
        int weight;

        Node(Fief destinationFief, int weight) {
            this.destinationFief = destinationFief;
            this.weight = weight;
        }
    }

    static class Fief {
        double taxQuantity;
        List<Node> edgesList;

        public Fief(int taxQuantity) {
            this.taxQuantity = taxQuantity;
            this.edgesList = new ArrayList<>();
        }

        public void addRoute(Fief destinationFief, int weight) {
            edgesList.add(new Node(destinationFief, weight));
        }

        public int calculateTotalDistance(Fief previousCity) {
            int totalDistance = 0;

            for (Node edge : edgesList) {
                if (edge.destinationFief == previousCity) {
                    continue;
                }

                totalDistance += edge.destinationFief.calculateTotalDistance(this);
                int travelsNumber = (int) Math.ceil(edge.destinationFief.taxQuantity / BarrasDeOuro.cargoCapacity) * 2;
                totalDistance += travelsNumber * edge.weight;
                this.taxQuantity += edge.destinationFief.taxQuantity;
            }
            return totalDistance;
        }
    }

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

        String[] lineArgs = firstLine.split("\\s+");
        int n = Integer.parseInt(lineArgs[0]);
        BarrasDeOuro.cargoCapacity = Integer.parseInt(lineArgs[1]);

        List<Fief> cities = new ArrayList<>();
        String[] taxTokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            cities.add(new Fief(Integer.parseInt(taxTokens[i])));
        }

        for (int i = 0; i < n - 1; ++i) {
            String[] graphInfos = scanner.nextLine().trim().split("\\s+");
            int a = Integer.parseInt(graphInfos[0]) - 1;
            int b = Integer.parseInt(graphInfos[1]) - 1;
            int c = Integer.parseInt(graphInfos[2]);

            cities.get(a).addRoute(cities.get(b), c);
            cities.get(b).addRoute(cities.get(a), c);
        }

        System.out.println(cities.get(0).calculateTotalDistance(null));
        scanner.close();
    }
}