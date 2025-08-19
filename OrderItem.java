public class OrderItem {
    private String itemId;
    private int qty;

    public OrderItem(String itemId, int qty) {
        this.itemId = itemId;
        this.qty = qty;
    }

    public String getItemId() { return itemId; }
    public int getQty() { return qty; }
}
