package homework.lessons.lesson05.lesson0503;

public class Order {
    private String productName;
    private int amount;
    private double price;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public Order(String productName, int amount, double price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }


}
