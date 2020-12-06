package lessons.lesson07.lesson0701;

public class JavaDeveloper implements Developer, Human {
    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Code...");
    }

    @Override
    public void enjoyLife() {
        System.out.println("Java developer enjoys life...");
    }

    @Override
    public void breath() {
        System.out.println("Breathing like a human...");
    }

    @Override
    public String toString() {
        return "Java Developer" +
                "\nname: " + name + "\n";
    }
}
