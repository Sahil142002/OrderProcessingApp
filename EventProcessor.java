import java.util.ArrayList;
import java.util.List;

public class EventProcessor {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void processEvent(Order order, Event event) {
        switch (event.getType()) {
            case "CREATED":
                order.setStatus(OrderStatus.CREATED);
                break;
            case "SHIPPED":
                order.setStatus(OrderStatus.SHIPPED);
                break;
            case "CANCELLED":
                order.setStatus(OrderStatus.CANCELLED);
                break;
            case "PAID":
                order.setStatus(OrderStatus.PAID);
                break;
            default:
                System.out.println("Unknown event: " + event.getType());
                return;
        }

        for (OrderObserver observer : observers) {
            observer.onEventProcessed(order, event);
        }
    }
}
