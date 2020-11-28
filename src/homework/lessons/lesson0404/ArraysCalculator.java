package homework.lessons.lesson0404;

public class ArraysCalculator {

    public String[] concatArrays(String array1[], String array2[]) {
        String[] array3 = new String[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];

        }


        //System.arraycopy(array1, 0, array3, 0, array1.length);
        //System.arraycopy(array2, 0, array3, array1.length-1, array2.length);
        return array3;

    }
}
