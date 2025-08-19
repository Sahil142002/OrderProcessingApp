public class Main {
    public static void main(String[] args) {
        Order order = new Order("1001");
        EventProcessor processor = new EventProcessor();

        processor.addObserver(new LoggerObserver());
        processor.addObserver(new AlertObserver());

        processor.processEvent(order, new Event("CREATED"));
        processor.processEvent(order, new Event("PAID"));
        processor.processEvent(order, new Event("SHIPPED"));
        processor.processEvent(order, new Event("CANCELLED"));
    }
}
