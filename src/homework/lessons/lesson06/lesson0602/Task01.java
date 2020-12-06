package homework.lessons.lesson06.lesson0602;

public class Task01 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d", i);
            for (int j = 2; j < 10; j++) {
                int a = i * j;
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("%36s%n", "Таблица умножения");
        System.out.printf("%.36s%n", "--------------------------------------------------");

        int[][] multTable = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                //System.out.print(multTable[i][j] + "\t");
                System.out.printf("%4d", multTable[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
