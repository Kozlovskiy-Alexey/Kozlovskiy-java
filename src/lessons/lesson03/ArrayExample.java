package lessons.lesson03;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[3]; // ВНУТРИ НУЛЕВЫЕ ЗНАЧЕНИЯ
        int[] array1 = new int[]{1, 5, 7};
        int[] array2 = {1, 6, 6};
        int length = array.length;  // выводим размер массива

        System.out.println(length);
        System.out.println(array[1]);

        int size = 50;
        int[] array3 = new int[size];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = size - i;
        }
        System.out.println(array3);
        System.out.println(Arrays.toString(array3));

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for (int i : array1)
            System.out.println( i + " ");

        String[][] dArray = new String[3][];
        System.out.println(dArray[0]);
        dArray[0] = new String[] {"one","two"};
        System.out.println(dArray[0][1]);


    }
}
