package lessons.lesson04.entities;

public class Person {

    public String name;
    public int age;
    public Country country;
    public Sex sex;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat(String dish) {
        System.out.println(name + " is eating " + dish);
    }

    public int growOld() {
        return ++age;
    }


}
