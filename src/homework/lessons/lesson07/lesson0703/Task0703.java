package homework.lessons.lesson07.lesson0703;

/*Есть 3 класса – Прямоугольник, Квадрат, Круг (создать их).
Дополнить классы необходимыми полями и создать на их основе иерархию классов
(то есть кто-то от кого-то должен наследоваться, при необходимости
можно создавать дополнительные классы и интерфейсы).
Создать класс CalculationUtils, в котором должны быть 2 метода,
принимающие любую фигуру и возвращающие ее а) площадь б) периметр.

 */
public class Task0703 {
    public static void main(String[] args) {
        CalculationUtils temp = new CalculationUtils();
        Square one = new Square(10);

        double a = temp.area(one);
        double p = temp.perimeter(one);

        System.out.println(a);
        System.out.println(p);

    }
}
