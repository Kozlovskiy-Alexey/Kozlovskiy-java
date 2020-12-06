package lessons.lesson07;

public class Builder extends Profession {
    String sex;

    public Builder(String professionName, String industry, String sex) {
        super(professionName, industry);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void doJob() {
        System.out.println("Builder build houses...");
    }

    @Override
    public String toString() {
        return "Profession Info" +
                "\nProfession Name: " + professionName +
                "\nIndustry:" + industry +
                "\nSex" + sex + "\n";
    }
}
