package homework.lessons.lesson0404;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /*Создать класс ArraysCalculator (или дописать в класс из предыдущей задачи),
в нем создать метод concatArrays(), который должен принимать два массива строк.
Метод должен выводить в строку элементы обоих массивов по очереди, начиная с массива,
в котором больше элементов,
или с любого, если элементов одинаковое количество.*/
        ArraysCalculator calculator = new ArraysCalculator();
        String[] array1 = new String[] {"I", "to", "this"};
        String[] array2 = new String[] {"have", "do", "task"};

        String[] summ = calculator.concatArrays(array1,array2);
        System.out.println(Arrays.toString(summ));
    }
}
