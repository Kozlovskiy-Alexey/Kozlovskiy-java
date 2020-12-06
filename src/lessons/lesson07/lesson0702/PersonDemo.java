package lessons.lesson07.lesson0702;

class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();

        person.setId(1);
        person.setName("Artyom");

        System.out.println("Person info:");
        System.out.println("Person id: " + person.getId());
        System.out.println("Person name: " + person.getName());




    }
}
