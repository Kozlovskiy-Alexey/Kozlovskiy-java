package homework.lessons.lesson05.lesson0503;

public class GetOrders {
    double temp = 0;

    public double costAllOrders(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getAmount() < 10) {
                temp = temp + orders[i].getAmount() * orders[i].getPrice();
            }
            else if (orders[i].getAmount() < 50) {
                temp = temp + (orders[i].getAmount() * orders[i].getPrice() * 0.9);
            }
            else {
                temp = temp + (orders[i].getAmount() * orders[i].getPrice() * 0.8);
            }
        }
        return temp;
    }
}

