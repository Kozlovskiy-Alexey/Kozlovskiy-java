package homework.lessons.lesson07.leson0702;

public class Animal {

    private String breed;
    private String name;
    private int age;

    public Animal(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("Animal is playing with human");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
