OrderProcessingApp/
│
├── Event.java                 # Base event class
├── OrderCreatedEvent.java     # Event when order is created
├── PaymentReceivedEvent.java  # Event when payment is received
├── ShippingScheduledEvent.java# Event when shipping is scheduled
├── OrderCancelledEvent.java   # Event when order is cancelled
│
├── Order.java                 # Represents an Order
├── OrderStatus.java           # Enum of order statuses
├── EventProcessor.java        # Processes incoming events
├── EventReader.java           # Reads events from a file
│
├── Observer.java              # Observer interface
├── LoggerObserver.java        # Logs events
├── AlertObserver.java         # Sends alerts on critical events
│
└── Main.java                  # Entry point


Steps to run the Project:
1. git clone https://github.com/your-username/OrderProcessingApp.git
2. cd OrderProcessingApp
3. javac *.java
4. java Main
