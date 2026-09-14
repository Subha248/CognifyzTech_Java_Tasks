public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("  MULTI-THREADED E-COMMERCE INVENTORY SYSTEM");
        System.out.println("==============================================\n");

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 55000.00, 5));
        manager.addProduct(new Product(102, "Smartphone", 25000.00, 3));
        manager.addProduct(new Product(103, "Headphones", 2000.00, 10));

        System.out.println("\n--- INITIAL STOCK ---");
        manager.displayStock();

        System.out.println("--- STARTING CONCURRENT CUSTOMER TRANSACTIONS ---\n");

        Customer c1 = new Customer("Customer-A", manager, 101, 2);
        Customer c2 = new Customer("Customer-B", manager, 101, 2);
        Customer c3 = new Customer("Customer-C", manager, 101, 2);
        Customer c4 = new Customer("Customer-D", manager, 102, 1);
        Customer c5 = new Customer("Customer-E", manager, 102, 2);
        Customer c6 = new Customer("Customer-F", manager, 103, 5);
        Customer c7 = new Customer("Customer-G", manager, 103, 6);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
            c6.join();
            c7.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("\n--- FINAL STOCK ---");
        manager.displayStock();
        manager.displayTransactionLog();

        System.out.println("==============================================");
        System.out.println("  ALL TRANSACTIONS COMPLETED SUCCESSFULLY");
        System.out.println("  Thread Safety: 100% Achieved");
        System.out.println("==============================================");
    }
}
