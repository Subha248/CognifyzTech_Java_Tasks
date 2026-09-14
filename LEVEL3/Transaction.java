import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int transactionId;
    private String customerName;
    private String productName;
    private int quantity;
    private double totalAmount;
    private String status;
    private LocalDateTime timestamp;

    public Transaction(int transactionId, String customerName, String productName,
                       int quantity, double totalAmount, String status) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Transaction[ID=" + transactionId +
               ", Customer=" + customerName +
               ", Product=" + productName +
               ", Qty=" + quantity +
               ", Amount=Rs." + totalAmount +
               ", Status=" + status +
               ", Time=" + timestamp.format(formatter) + "]";
    }
}
