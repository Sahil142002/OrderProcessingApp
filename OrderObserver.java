public interface OrderObserver {
    void onEventProcessed(Order order, Event event);
}
