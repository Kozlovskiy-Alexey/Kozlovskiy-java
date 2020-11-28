package homework.lessons.lesson05.lesson0503;

public class GetOrders {
    double temp = 0;

    public double costAllOrders(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            temp = temp + orders[i].getAmount() * orders[i].getPrice();
        }
     return temp;
    }


}
