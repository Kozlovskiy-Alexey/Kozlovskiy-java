package homework.lessons.lesson06.leson0601;

import javax.sound.midi.Soundbank;

public class Task1 {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        double result1;
        double result2;
        double result3;
        double result4;

        result1 = calculate.sum(3.0,4.5);
        result2 = calculate.subtract(105.1,18);
        result3 = calculate.multiply(15.5,10);
        result4 = calculate.divide(100.8,4.2);

        System.out.printf("result1 is %f\n", result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
