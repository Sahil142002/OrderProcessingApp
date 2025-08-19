import java.io.*;
import java.util.*;

public class EventReader {
    public List<Event> readEvents(String filePath) {
        List<Event> events = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String orderId = parts[1];

                Event event = null;
                if (type.equals("OrderCreated")) {
                    String customerId = parts[2];
                    List<String> items = Arrays.asList(parts[3].split("\\|"));
                    double totalAmount = Double.parseDouble(parts[4]);
                    event = new OrderCreatedEvent(orderId, customerId, items, totalAmount);
                } else if (type.equals("PaymentReceived")) {
                    double amount = Double.parseDouble(parts[2]);
                    event = new PaymentReceivedEvent(orderId, amount);
                } else if (type.equals("ShippingScheduled")) {
                    event = new ShippingScheduledEvent(orderId);
                } else if (type.equals("OrderCancelled")) {
                    event = new OrderCancelledEvent(orderId);
                }

                if (event != null) events.add(event);
            }
        } catch (Exception e) {
            System.out.println("Error reading events: " + e.getMessage());
        }

        return events;
    }
}
