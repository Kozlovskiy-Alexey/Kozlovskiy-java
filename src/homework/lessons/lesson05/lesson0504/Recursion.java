package homework.lessons.lesson05.lesson0504;

public class Recursion {
    private int[] array;



    public Recursion(int i) {
        array = new int[i];
    }

    public int fac(int n) {
        if (n == 1)
            return 1;
        return n * fac(n - 1);
    }
}
