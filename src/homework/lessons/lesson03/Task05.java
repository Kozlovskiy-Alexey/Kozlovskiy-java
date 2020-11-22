package homework.lessons.lesson03;

public class Task05 {
    public static void main(String[] args) {

        int[][] array1 = new int[3][3];
        int[][] array2 = {{1, 2, 3},
                          {4, 5, 6}};

        array1[0][0] = 5;
        array1[0][1] = 10;
        array1[0][2] = 15;
        array1[1][0] = 20;
        array1[1][1] = 25;
        array1[1][2] = 30;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
