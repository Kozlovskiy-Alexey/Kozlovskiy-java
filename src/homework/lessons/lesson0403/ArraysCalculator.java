package homework.lessons.lesson0403;

public class ArraysCalculator {

    public int[] summArrays(int[] array1, int[] array2) {

        int[] summArray = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < array1.length; i++) {
            summArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            summArray[j] = summArray[j] + array2[j];
        }
        return summArray;

    }
}