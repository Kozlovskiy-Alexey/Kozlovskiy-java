package homework.lessons.lesson05.lesson0504;

public class TransformerString {
    private int a;
    private int sum = 0;

    public void getStringTransform(String[] arr, int num) {
        // решение через цикл for each
        for (String string : arr) {
            if (string.length() >= num) {
                System.out.print(string + " ");
            }
        }
        // решение через цикл for
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() >= num)
//                System.out.print(arr[i] + " ");
//        }
    }

    public int sumArray(int[] array) {
        for (int x : array) {
            sum = sum + x;
        }
        return sum;
    }
}
