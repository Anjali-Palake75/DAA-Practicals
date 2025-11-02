import java.util.*;

class Item {
    int weight; // e.g. weight of cargo, money to invest, time slot, resource units
    int value;  // e.g. value of cargo, returns, ad revenue, relief usefulness, task priority

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class GreedyKnapsack {

    public static double fractionalKnapsack(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take fraction of item if capacity is less
                totalValue += item.value * ((double) capacity / item.weight);
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        // Example: Cargo Loading scenario
        Item[] cargo = {
            new Item(10, 60),  // weight 10 tons, value $60k
            new Item(20, 100),
            new Item(30, 120)
        };
        int truckCapacity = 50; // max 50 tons

        double maxValue = fractionalKnapsack(cargo, truckCapacity);
        System.out.println("Max value loaded in truck: " + maxValue);

        // Example: Stock Investment scenario (weights = money invested, values = returns)
        Item[] stocks = {
            new Item(5000, 600),  // invest $5000, expected return $600
            new Item(10000, 1000),
            new Item(15000, 1200)
        };
        int moneyAvailable = 20000; // $20,000 to invest

        maxValue = fractionalKnapsack(stocks, moneyAvailable);
        System.out.println("Max expected return from stocks: " + maxValue);

        // You can do similarly for Ads, Relief Supplies, and Resource Allocation by changing inputs.
    }
}
