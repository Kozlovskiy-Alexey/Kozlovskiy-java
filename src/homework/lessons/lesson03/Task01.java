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
        int[] array2 = {3, 5, 9, 87, 45, 26, 48, 39, 78, 15};

//задаем массив
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

        // сортировка массива array2 методом пузырька для нахождения медианы
        //Arrays.sort(array2); сортировка методом
        //System.out.println(Arrays.toString(array2));
        boolean sort = false;
        int temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    sort = false;

                    temp = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array2));
        // вычислим медиану, как полусумму средних значений
        double med  = (double) (array2[4] + array2[5])/2;
        System.out.println("the median is " + med);

    }

}




