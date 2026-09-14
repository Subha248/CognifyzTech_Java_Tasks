import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class InventoryManager {
    private final Map<Integer, Product> inventory;
    private final List<Transaction> transactionLog;
    private final ReentrantLock lock = new ReentrantLock();
    private int transactionCounter = 0;

    public InventoryManager() {
        inventory = new HashMap<>();
        transactionLog = new ArrayList<>();
    }

    public void addProduct(Product product) {
        lock.lock();
        try {
            inventory.put(product.getProductId(), product);
            System.out.println("[SETUP] Added: " + product);
        } finally {
            lock.unlock();
        }
    }

    public synchronized boolean purchaseProduct(int productId, int quantity, String customerName) {
        System.out.println("[" + customerName + "] Attempting to purchase " +
                           quantity + " unit(s) of Product ID: " + productId);

        Product product = inventory.get(productId);

        if (product == null) {
            System.out.println("[" + customerName + "] FAILED: Product not found!");
            logTransaction(customerName, "N/A", quantity, 0, "FAILED - Product Not Found");
            return false;
        }

        if (product.getStockQuantity() < quantity) {
            System.out.println("[" + customerName + "] FAILED: Insufficient stock! " +
                               "Available: " + product.getStockQuantity());
            logTransaction(customerName, product.getProductName(), quantity, 0,
                           "FAILED - Insufficient Stock");
            return false;
        }

        int newStock = product.getStockQuantity() - quantity;
        product.setStockQuantity(newStock);
        double totalAmount = product.getPrice() * quantity;
        logTransaction(customerName, product.getProductName(), quantity, totalAmount, "SUCCESS");

        System.out.println("[" + customerName + "] SUCCESS! Purchased " + quantity +
                           " x " + product.getProductName() +
                           " | Remaining Stock: " + newStock);

        return true;
    }

    private void logTransaction(String customerName, String productName,
                                int quantity, double amount, String status) {
        lock.lock();
        try {
            transactionCounter++;
            Transaction transaction = new Transaction(
                transactionCounter, customerName, productName, quantity, amount, status
            );
            transactionLog.add(transaction);
        } finally {
            lock.unlock();
        }
    }

    public void displayStock() {
        lock.lock();
        try {
            System.out.println("\n========== CURRENT INVENTORY ==========");
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
            System.out.println("========================================\n");
        } finally {
            lock.unlock();
        }
    }

    public void displayTransactionLog() {
        lock.lock();
        try {
            System.out.println("\n========== TRANSACTION LOG ==========");
            for (Transaction t : transactionLog) {
                System.out.println(t);
            }
            System.out.println("=====================================\n");
        } finally {
            lock.unlock();
        }
    }

    public int getStock(int productId) {
        lock.lock();
        try {
            Product p = inventory.get(productId);
            return p != null ? p.getStockQuantity() : -1;
        } finally {
            lock.unlock();
        }
    }
}
