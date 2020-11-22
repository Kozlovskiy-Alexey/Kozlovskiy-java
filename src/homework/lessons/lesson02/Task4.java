package homework.lessons.lesson02;

public class Task4 {
    public static void main(String[] args) {
    /*4) Даны зарплаты трех людей salary1, salary2 и salary3.
    Найти разницу между максимальной и минимальной зарплатой.*/
        int salary1 = 350;
        int salary2 = 300;
        int salary3 = 250;

        int min = salary1;
        int max = salary1;

        if (salary2 < min)
            min = salary2;
        if (salary3 < min)
            min = salary3;

        if (salary2 > max)
            max = salary2;
        if (salary3 > max)
            max = salary3;
        System.out.println(max - min);


//        int salary4 = 1000;
//        int max = Math.max(salary1, Math.max(salary2, Math.max(salary3, salary4)));
//        System.out.println("максимальная зарплата " + max);
//        int min = Math.min(salary1, Math.min(salary2, Math.min(salary3, salary4)));
//        System.out.println("минимальная зарплата " + min);
//        System.out.println("разница межу максимальной и минимальной зарплатой составляет " + (max - min));


//        int max = Math.max(salary1, Math.max(salary2, salary3));
//        System.out.println("максимальная зарплата " + max);
//        int min = Math.min(salary1, Math.min(salary2, salary3));
//        System.out.println("минимальная зарплата " + min);
//        System.out.println("разница межу максимальной и минимальной зарплатой составляет " + (max - min));


    }
}
