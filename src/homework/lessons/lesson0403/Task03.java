package homework.lessons.lesson0403;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        /*Создать класс ArraysCalculator, в нем создать один метод sumArrays(),
который должен принимать два массива целых чисел, а возвращать массив,
состоящий из сумм соответствующих элементов входных массивов.
Если мы передали массивы разной длины, то для результирующего массива брать длину большего.
Например: передаем массивы {1, 5, 3} и {2, -5, 4, 10}, на выходе должны получить массив {3, 0, 7, 10}.
В другом классе создать метод main(), в нем создать объект класса ArraysCalculator и вызывать у него метод sumArrays().
Вывести результат(массив сумм) на консоль.
*/
        ArraysCalculator calculator = new ArraysCalculator();
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{5, 7, 9, 5};

        int[] summ = calculator.summArrays(array1, array2);
        System.out.println(Arrays.toString(summ));

    }
}
