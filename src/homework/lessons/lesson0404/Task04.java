package homework.lessons.lesson0404;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        ArraysCalculator calculator = new ArraysCalculator();
        String[] array1 = new String[] {"I", "to", "this"};
        String[] array2 = new String[] {"have", "do", "task"};

        String[] summ = calculator.concatArrays(array1,array2);
        System.out.println(Arrays.toString(summ));
    }
}
