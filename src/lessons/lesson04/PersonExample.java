package lessons.lesson04;

import lessons.lesson04.entities.Country;
import lessons.lesson04.entities.Person;
import lessons.lesson04.entities.Sex;

public class PersonExample {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Vasiliy";
        person1.age = 30;
        person1.country = new Country("Belatus", 220320);
        person1.sex  = Sex.MALE;

        Person person2 = new Person();
        person2.name = "Tatiana";
        person2.age = 20;
        person2.country = new Country("Belatus", 220320);
        person2.sex = Sex.FEMALE;

        System.out.println(person1.country);
        System.out.println(person2.country);

        person2.country = person1.country;

        System.out.println(person1.country);
        System.out.println(person2.country);

        person1.walk();
        person2.walk();

        person1.eat("fish");

        System.out.println(person1.growOld());

        System.out.println(person1.growOld());






    }
}
