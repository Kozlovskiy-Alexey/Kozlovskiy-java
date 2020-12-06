package homework.lessons.lesson07.leson0702;

public class Cat extends Animal {

    public Cat(String breed, String name, int age) {
        super(breed, name, age);
    }

    @Override
    public void play() {
        System.out.printf("Cat %s is myaowing\n",getName());
    }

}
