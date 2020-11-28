package homework.lessons.lesson05.lesson0501;

public class MassiveDays {
    private double startTemp;
    private double tempDiff;
    private int days;

    public MassiveDays(double startTemp, double tempDiff, int days) {
        this.startTemp = startTemp;
        this.tempDiff = tempDiff;
        this.days = days;
    }

//    @Override
//    public String toString() {
//        return "startTemp: " + startTemp + " tempDiff: " + tempDiff + " days: " + days;
//    }

    public double[] transformTemp() {
        double[] massiveTemp = new double[days];
        massiveTemp[0] = startTemp;
        for (int i = 1; i < massiveTemp.length; i++) {
            massiveTemp[i] = massiveTemp[i-1] + tempDiff;
        }
        return massiveTemp;
    }

}

