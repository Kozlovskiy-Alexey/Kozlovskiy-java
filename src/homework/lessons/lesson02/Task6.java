package homework.lessons.lesson02;

public class Task6 {
    public static void main(String[] args) {
        /*6) Банк предлагает вклад под процент.
        Дано: начальная сумма вклада startSum, процент годовых proc,
        количество лет years, на которые совершается вклад.
        Сумма индексируется каждый год (это значит, что после каждого года
        процент начисляется не на изначальную сумму, а на текущую).
        Вывести, сколько денег будет на счету после years лет.
        *доп. Каждый год банк вычитает из суммы вклада налог в размере 1%
         от изначального вклада.*/
        double startSum = 1000;
        double proc = 1.5;
        int years = 10;
        double result = startSum;
        for (int i = 0; i < years; i++) {
            double tax = startSum * 0.01;
            result = result + result * proc / 100;
            System.out.println(result - tax);
        }
    }
}
