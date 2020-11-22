package homework.lessons.lesson02;

public class Task5 {
    public static void main(String[] args) {
        /*5) Даны 2 числа, a – целое, n – целое положительное.
        Используя цикл, найти результат возведения a в степень n.*/
        int a = 3;
        int n = 5;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        System.out.println(a + " в степени " + n + " = " + result);
    }
}
