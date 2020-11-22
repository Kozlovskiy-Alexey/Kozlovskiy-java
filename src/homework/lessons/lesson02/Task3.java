package homework.lessons.lesson02;

public class Task3 {
    public static void main(String[] args) {
    /*Дана температура в градусах. Вывести на экран ,
    что лучше надеть: куртку, свитер, майку или ничего.
Например,при температуре менее 10 – куртку,
от 10 до 15 – ветровку, от 16 до 20 свитер,
от 21 до 30 майку, выше 30 – ничего.*/
        int temp = 9;
        String result;

        if (temp < 10)
            result = "Рекомендуем надеть куртку";

        else if (temp < 15)
            result = "Рекомендуем надеть ветровку";
        else if (temp < 20)
            result = "Рекомендуем надеть свитер";
        else if (temp < 25)
            result = "Рекомендуем надеть майку";
        else
            result = "можно выходить голым)";

        System.out.println(result);

    }
}
