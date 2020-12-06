package homework.lessons.lesson07.leson0702;

public class Dog extends Animal{


    public Dog(String breed, String name, int age) {
        super(breed,name,age);

    }

    @Override
    public void play() {
        System.out.printf("Dog %s is barking and jumping\n", getName());
    }


}
