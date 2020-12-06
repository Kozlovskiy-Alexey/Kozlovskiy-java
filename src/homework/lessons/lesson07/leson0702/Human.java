package homework.lessons.lesson07.leson0702;

public class Human {

    String name;

    public Human(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " playing with pet");
    }

    public void play(Animal animal) {
        System.out.println(name + " playing with pet " + animal.getName());

    }
}