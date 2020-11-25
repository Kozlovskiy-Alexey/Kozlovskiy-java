package homework.lessons.training;

public class NextGeneration {
    public static void main(String[] args) {

        Person person1 = new Person(37, "Alexey", 80, 186);
        person1.setAge(-5);
        person1.setName("Ilia");
        System.out.println(person1.getAge());

        Person person2 = new Person(36, "Natasha", 60, 160);
        person2.setAge(25);
        person1.displayInfo();
        person2.displayInfo();
    }
}
