package homework.lessons.training;

public class Person {
    private int age;
    private String name;
    private int weight;
    private int hight;

    public Person(int age, String name, int weight, int hight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHight() {
        return hight;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age must be +");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    void displayInfo() {
        System.out.println(name + " " + age + " " + hight + " " + weight);
    }
}
