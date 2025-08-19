public class AlertObserver implements OrderObserver {
    @Override
    public void onEventProcessed(Order order, Event event) {
        if (order.getStatus() == OrderStatus.CANCELLED || order.getStatus() == OrderStatus.SHIPPED) {
            System.out.println("[ALERT] Sending alert for Order " + order.getOrderId() +
                    ": Status changed to " + order.getStatus());
        }
    }
}
