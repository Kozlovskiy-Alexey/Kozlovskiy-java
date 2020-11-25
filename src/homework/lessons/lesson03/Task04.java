package homework.lessons.lesson03;

public class Task04 {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 3;
        array[2] = 1;
        array[3] = 7;
        array[4] = 9;

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Multiplication table:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j<= 10; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}

