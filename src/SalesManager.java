public class SalesManager {

    protected long[] sales = {100, 200, 300};

    public SalesManager() {
        this.sales = sales;
    }

    public long max(long sales) {
        long max = -1;
        for (long sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}