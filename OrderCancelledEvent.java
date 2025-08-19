public class OrderCancelledEvent extends Event {
    public OrderCancelledEvent(String orderId) {
        super(orderId);
    }
}
