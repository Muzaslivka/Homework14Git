public class Main {

    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();
        int maxSale = salesManager.max();
        int minSale = salesManager.min();
        int average = salesManager.average();
        System.out.println(maxSale);
        System.out.println(minSale);
        System.out.println(average);
    }
}
