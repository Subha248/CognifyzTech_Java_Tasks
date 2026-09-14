public class Customer extends Thread {
    private String customerName;
    private InventoryManager inventoryManager;
    private int productId;
    private int quantity;

    public Customer(String customerName, InventoryManager inventoryManager,
                    int productId, int quantity) {
        this.customerName = customerName;
        this.inventoryManager = inventoryManager;
        this.productId = productId;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 1000));
            inventoryManager.purchaseProduct(productId, quantity, customerName);
        } catch (InterruptedException e) {
            System.out.println("[" + customerName + "] Thread interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
