package homework.lessons.lesson05.lesson0503;
/*Создать класс Order (заказ). В нем будут такие поля:
- название товара (строка)
- количество штук (целое число)
- цена за штуку (вещественное число)
В другом классе создать метод, который должен принимать массив товаров
(Order[] orders), рассчитывать и возвращать общую сумму всех заказов,
при условии, что если количество заказанных единиц одного товара – более 10,
предоставляется скидка в 10%, а если более 50 – то 20%.*/

public class Task0503 {
    public static void main(String[] args) {
        Order order1 = new Order("Chips", 10, 1.50);
        Order order2 = new Order("Coca", 2, 0.50);

        Order[] orders = new Order[]{order1, order2};

        GetOrders get = new GetOrders();


    }
}