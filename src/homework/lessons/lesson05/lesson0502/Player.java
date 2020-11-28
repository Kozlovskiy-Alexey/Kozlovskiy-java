package homework.lessons.lesson05.lesson0502;

public class Player {
    private int x;
    private int y;
    double distance = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance() {
        return distance;
    }

    public Player() {
        x = 0;
        y = 0;
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        int tempX = x - newX;
        int tempY = y - newY;
        this.x = newX;
        this.y = newY;
        distance = distance + Math.sqrt(Math.pow(tempX, 2) + Math.pow(tempY, 2));
    }
}
