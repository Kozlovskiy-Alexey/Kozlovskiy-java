package homework.lessons.lesson07.leson0702;

public class Fish extends Animal {

    public Fish(String breed, String name, int age) {
        super(breed, name, age);
    }

    @Override
    public void play() {
        System.out.printf("Fish %s is swimming\n", getName());
    }


}
