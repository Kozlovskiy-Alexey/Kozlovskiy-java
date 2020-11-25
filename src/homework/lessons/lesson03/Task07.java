package homework.lessons.lesson03;

public class Task07 {
    public static void main(String[] args) {
        int n = 4;
        int[][] triangle = new int[n][];
        int startN = 2;
        int currentN = startN;

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = currentN;
                currentN *=2;
            }
        }
        for (int[] ar : triangle) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }



    }

}
