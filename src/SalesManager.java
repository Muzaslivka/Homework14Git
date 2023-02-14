public class SalesManager {

    protected long[] sales = {100, 200, 300, 400, 500, 300};

    public SalesManager() {
        this.sales = sales;
    }


    public long max() {
        long max = -1;
        for (long sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum - (min() + max())) / (sales.length - 2);
    }

}