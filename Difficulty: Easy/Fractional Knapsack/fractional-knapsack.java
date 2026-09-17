class Solution {
    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort by value/weight ratio (highest first)
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double)b.value / b.weight,
                (double)a.value / a.weight
            )
        );

        double ans = 0;

        for (Item item : items) {
            if (W >= item.weight) {
                // Take complete item
                ans += item.value;
                W -= item.weight;
            } else {
                // Take fraction of item
                ans += (double)item.value * W / item.weight;
                break;
            }
        }

        return ans;
    }
}