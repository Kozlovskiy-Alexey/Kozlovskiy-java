package homework.lessons.lesson07.lesson0703;

public class CalculationUtils {

    public double area(Square square) {
        double s = Math.pow(square.getSideA(), 2);
        return s;
    }

    public double perimeter(Square square) {
        double p = square.getSideA() * 4;
        return p;
    }
}

