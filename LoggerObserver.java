public class LoggerObserver implements OrderObserver {
    @Override
    public void onEventProcessed(Order order, Event event) {
        System.out.println("[LOG] Order " + order.getOrderId() +
                " processed event: " + event.getType() +
                ", new status: " + order.getStatus());
    }
}
