package homework.lessons.lesson0403;

public class ArraysCalculator {

    public int[] summArrays(int[] array1, int[] array2) {

        int[] summArray = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < summArray.length; i++) {
            summArray[i] = array1[i] + array2[i];
        }
        return summArray;

    }
}