package homework.lessons.lesson03;

public class Task02 {
    public static void main(String[] args) {
        /*
        2. Дано: «треугольный» массив, то есть двумерный массив,
в котором в нулевой ячейке содержится массив с 1 ячейкой,
в первой – с двумя, во второй – с тремя и т.д. Высота равна n.
Заполнить массив таким образом,
чтобы каждый следующий элемент был в 2 раза больше предыдущего,
и вывести его на консоль. Начинать со значения intStart.
Пример для n = 3 и intStart = 5:

5
10 20
40 80 160

*доп. Заполнять не «слева-направо», а «справа-налево»:

5
20 10
120 80 40
         */
        int n = 3;
        int[][] array = new int[n][];
        int intStart = 5;
// цикл для создания треугольного массива
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1]; // создание строки в массиве
        }
        //заполнение массива слева - направо
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = intStart;
                intStart = intStart * 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



    }
}
