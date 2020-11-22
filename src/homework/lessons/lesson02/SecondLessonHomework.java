package homework.lessons.lesson02;

public class SecondLessonHomework {
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        boolean x = true;
        boolean y = false;
        char unicod;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(b % a);
        System.out.println(--a + "\n " + ++b);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a << b);
        System.out.println("a>=b " + (a >= b));
        System.out.println("a<=b " + (a <= b));
        System.out.println(x | y); // дизъюнкция OR
        System.out.println(x & y); // коньюнкция AND
        System.out.println(5 | 6);
        System.out.println(5 & 6);
        System.out.println("a in UNICODE" + 'a');
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(127));
        System.out.println(Integer.toBinaryString(128));
        System.out.println(Integer.toBinaryString(255));
        System.out.println(255 & 1);
        System.out.println(5 ^ 6);

        for(int i =0; i< 128; i++){
            char c = (char)i;
            System.out.println(c + " - " + i);
        }

        /* 2) Создать переменную r целого типа.
        Присвоить ей какое-то значение. r – радиус окружности.
        Вывести на экран площадь круга и длину окружности.
        Усложним, перед тем, как вычислять радиус и площадь,
        проверьте, что r – положительно. Если так – то вычисляем,
        если нет – выведем на консоль сообщение о невалидности входных данных. */
        double r = 10;
        System.out.println("площадь круга равна Pi*r2 = " + Math.PI * Math.pow(r, 2));
        System.out.println("площадь круга равна 2*Pi*r = " + 2 * Math.PI * r);
        System.out.println();
        if (r > 0)
            System.out.println("площадь круга равна Pi*r2 = " + Math.PI * Math.pow(r, 2));
        else
            System.out.println("введите положительное число");
        char xy =  (char) a;
        System.out.println(xy+ " " + a);
        System.out.println(xy + 1);
        System.out.printf("выводим минимальное значение: %d", a);

    }
}
