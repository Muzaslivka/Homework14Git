public class Main {

    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();

        long maxSale = salesManager.max();
        long minSale = salesManager.min();
        long average = salesManager.average();

        System.out.println(maxSale);
        System.out.println(minSale);
        System.out.println(average);
    }
}
