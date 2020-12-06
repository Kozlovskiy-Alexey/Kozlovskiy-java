package lessons.lesson07.lesson0703;

class DeveloperDemo {
    public static void main(String[] args) {

        JavaDeveloper javaDeveloper = new JavaDeveloper(2, "Petya",375236365, "Minsk");
        javaDeveloper.demonstrateSuperKeyword();

        Developer developer = new Developer(1, "Vasya");
        developer.displaySpeciality();

        developer.setSpeciality("PHP Developer");
        System.out.println(developer.getSpeciality());

    }
}
