package GreedyAlgo;
import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    // Constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class FractionalKnapsack2 {
    // Function to solve the Fractional Knapsack problem
    public static double fractionalKnapsack(int W, Item[] items, int n) {
        // Step 1: Calculate value-to-weight ratio for each item and sort them in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);  // Sort by decreasing ratio
            }
        });

        double totalValue = 0.0;  // Total value we can carry in the knapsack

        // Step 2: Iterate through sorted items and add as much as possible to the knapsack
        for (int i = 0; i < n; i++) {
            if (W == 0) break;  // If the knapsack is full, break the loop

            // If the item can fully fit in the knapsack, take it all
            if (items[i].weight <= W) {
                W -= items[i].weight;
                totalValue += items[i].value;
            } else {
                // Take the fractional part of the item
                totalValue += items[i].value * ((double) W / items[i].weight);
                W = 0;  // Knapsack is full
            }
        }

        return totalValue;  // Return the maximum value we can carry
    }

    public static void main(String[] args) {
        // Step 3: Define items with their values and weights
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        int W = 50;  // Knapsack capacity

        // Step 4: Solve the problem and print the result
        double maxValue = fractionalKnapsack(W, items, items.length);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
