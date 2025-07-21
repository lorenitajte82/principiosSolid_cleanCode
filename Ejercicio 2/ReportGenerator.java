public class ReportGenerator {
    public void generateSalesReport(String title, List<Double> sales) {
        System.out.println("Report: " + title);
        double sum = 0;
        for (int i = 0; i < sales.size(); i++) {
            System.out.println("Sale #" + (i + 1) + ": " + sales.get(i));
            sum += sales.get(i);
        }
        double avg = sum / sales.size();
        System.out.println("Total Sales: " + sum);
        System.out.println("Average Sale: " + avg);
    }

    public void generateInventoryReport(String title, List<Integer> inventory) {
        System.out.println("Report: " + title);
        int sum = 0;
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("Item #" + (i + 1) + ": " + inventory.get(i));
            sum += inventory.get(i);
        }
        double avg = (double) sum / inventory.size();
        System.out.println("Total Items: " + sum);
        System.out.println("Average Item: " + avg);
    }
}