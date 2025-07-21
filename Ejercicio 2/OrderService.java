public class OrderService {
    public void processOnlineOrder(double total) {
        if (total < 0) {
            System.out.println("Total cannot be negative");
        } else if (total == 0) {
            System.out.println("Order total is zero");
        } else {
            System.out.println("Processing online order: " + total);
        }
    }

    public void processInStoreOrder(double total) {
        if (total < 0) {
            System.out.println("Total cannot be negative");
        } else if (total == 0) {
            System.out.println("Order total is zero");
        } else {
            System.out.println("Processing in-store order: " + total);
        }
    }
}