package homework.lessons.lesson03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
/*1. Создать массив целых чисел, записать в него 10 значений.
Посчитать и вывести сумму всех значений и среднее значение.
1*. Посчитать и вывести медиану.*/
        int summ = 0;
        int a = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            a = a + 5;
            array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        System.out.println("сумма всех значений массива = " + summ);

        double mean = (double) summ / array.length;
        System.out.println("среднее значение суммы чисел массива = " + mean);
        System.out.println();
    }

}




