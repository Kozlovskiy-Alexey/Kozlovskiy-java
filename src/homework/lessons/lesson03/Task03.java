package homework.lessons.lesson03;

public class Task03 {
    public static void main(String[] args) {
        /*3. Вывести в строку через пробел все числа от 1 до 100
(включая обе границы), которые делятся без остатка на 3 и на 7 одновременно.
*доп1. Вывести в строку через пробел все числа от 1 до 100,
которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7.
*доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99],
которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.
Эта задача решается через цикл и ифы
         */

//все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7 одновременно
        for (int i = 1; i <= 100; i++) {
            int div = i % 3;
            int div1 = i % 7;

            if (div == 0 && div1 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

// числа, которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7
        for (int i = 1; i <= 100; i++) {
            int div = i % 5;
            int div1 = i % 7;

            if (div == 0 || div1 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

 /* Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99],
 которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7. */
        int a = 10;
        int[][] array = new int[5][10];

        // заполнение массива слева-направо
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] = a;
                a++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            a = a + 10;
        }
        System.out.println();

        // проверяем условие деления на 5 или 7 и выводим массив на экран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int div1 = array[i][j] % 5;
                int div2 = array[i][j] % 7;
                if (div1 == 0 || div2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
