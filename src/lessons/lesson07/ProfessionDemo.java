package lessons.lesson07;

public class ProfessionDemo {
    public static void main(String[] args) {
        Profession developer = new Profession.Developer("Developer", "IT", "Java");
        Profession builder = new Builder("tiler", "constraction", "male");

        System.out.println(developer);
        developer.doJob();
        System.out.println("-------------------------");

        System.out.println(builder);
        builder.doJob();
        System.out.println("--------------------------");

    }
}
