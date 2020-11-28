package homework.lessons.lesson05.lesson0501;
/*Описать метод, который принимает три входных параметра:
double startTemp, double tempDiff, int days.
Метод должен возвращать массив вещественных чисел длиной days,
в котором нулевой элемент – startTemp, а каждый последующий
отличается от предыдущего на случайную величину,
но не более, чем на tempDiff в любую сторону.*/

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task0501 {
    public static void main(String[] args) {
        MassiveDays massiveDays = new MassiveDays(21.5, 2, 30);

        System.out.println(Arrays.toString(massiveDays.transformTemp()));
    }
}

