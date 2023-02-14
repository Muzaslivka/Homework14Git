public class SalesManager {

    protected int[] sales = {100, 200, 300};

    public SalesManager() {
        this.sales = sales;
    }

    public int max(int sales) {
        int max = -1;
        for (int sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}