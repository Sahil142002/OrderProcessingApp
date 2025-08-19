import java.util.List;

public class OrderCreatedEvent extends Event {
    private String customerId;
    private List<String> items;
    private double totalAmount;

    public OrderCreatedEvent(String orderId, String customerId, List<String> items, double totalAmount) {
        super(orderId);
        this.customerId = customerId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
