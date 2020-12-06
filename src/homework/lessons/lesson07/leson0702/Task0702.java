package homework.lessons.lesson07.leson0702;
/*Написать класс Человек, у которого есть поле "питомец".
Питомцы бывают 3х видов: Котик, Собачка и Рыбка.
Каждый питомец умеет играть, но делают они это по-разному.
Котик мяукает, Собака лает и прыгает, Рыбка плавает по кругу.
Описать у человека метод, который позволяет играть со своим????
питомцем, и метод, который позволяет играть с любым питомцем?????.
Как добавить поле питомец в класс Человыек???*/

public class Task0702 {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Taksa", "Mike", 2);
        Animal cat1 = new Cat("British", "Nusha", 3);
        Animal fish1 = new Fish("Gold", "Nemo", 1);
        Animal dog2 = new Dog("Haski", "Nik", 4);
        Human human1 = new Human("Oleg");

        dog1.play();
        cat1.play();
        fish1.play();
        dog2.play();
        human1.play(dog1);
        human1.play(cat1);
        human1.play(fish1);

    }
}
