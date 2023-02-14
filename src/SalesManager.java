public class SalesManager {

    protected int[] sales = {100, 200, 300, 400, 500, 300};

    public SalesManager() {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum - (min() + max())) / (sales.length - 2);
    }

}