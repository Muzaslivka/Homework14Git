public class Main {

    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();
        int maxSale = salesManager.max(300);
        System.out.println(maxSale);
    }
}
