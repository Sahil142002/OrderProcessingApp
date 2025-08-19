public class PaymentReceivedEvent extends Event {
    private double amountPaid;

    public PaymentReceivedEvent(String orderId, double amountPaid) {
        super(orderId);
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
