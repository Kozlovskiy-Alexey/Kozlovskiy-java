package homework.lessons.lesson03;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        boolean iq = false;
        int[] array = {58, 69, 78, 665, 859, 58};

        int temp;
// цикл while будет выполнятся пока в условии будет true, если будет false
        // цикл завершается
        while (!iq) {
            iq = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    iq = false;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
