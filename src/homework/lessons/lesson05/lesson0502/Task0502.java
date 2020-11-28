package homework.lessons.lesson05.lesson0502;
/*Создать класс Player (игрок). Игрок характеризуется местоположением,
то есть координатами int x и int y (можно взять и double, как хотите).
Описать у игрока метод move(int newX, int newY),
который перемещает игрока в новые координаты.
Создать 2 конструктора для класса Player, один – по умолчанию,
в нем игроку присвоить какое-то дефолтное местоположение,
во втором – указывать конкретное местоположение игрока при
создании экземпляра (объекта). Обратите внимание, что надо запретить
возможность «перемещать» игрока иначе как через метод move.
(*) – сделать так, чтобы игрок считал и запоминал, какое расстояние
он прошел с начала работы программы, и мог это расстояние вывести на консоль.
Для этого, добавить к классу поле double distance,
в которое записывать пройденное расстояние после каждого перемещения.
Расстояние считается по формуле Пифагора.*/
public class Task0502 {
    public static void main(String[] args) {
        Player player1 = new Player(0,0);
        Player player2 = new Player();

        player1.move(10,15);
        player1.move(20,20);
        player1.move(-10,-20);

        player2.move(15,15);
        player2.move(0,0);

        System.out.println("coordinate x: " + player1.getX() + " coordinate y: " + player1.getY() + " distance: " + player1.getDistance());
        System.out.println("coordinate x: " + player2.getX() + " coordinate y: " + player2.getY() + " distance: " + player2.getDistance());

    }
}
