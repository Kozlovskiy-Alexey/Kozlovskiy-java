package homework.lessons.lesson07.lesson0701;

class Author {

    protected String authorName;
    protected String authorLastName;
    protected int age;

    public void setAuthorName(String authorName) {
        if (authorName == null) {
            this.authorName = "AUTHOR NAME WAS NOT ENTERED";
        } else this.authorName = authorName;
    }

    public void setAuthorLastName(String authorLastName) {
        if (authorLastName == null) {
            this.authorLastName = "AUTHOR LAST NAME WAS NOT ENTERED";
        } else this.authorLastName = authorLastName;
    }

    public void setAuthorAge(int age) {
        if (age > 2) {
            this.age = age;
        } else this.age = 0;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getAge() {
        return age;
    }

    Author(String authorName, String authorLastName, int age) {

        setAuthorName(authorName);
        setAuthorLastName(authorLastName);
        setAuthorAge(age);
    }

    @Override
    public String toString() {
        return "Information about author:" +
                "\n-------------------" +
                "\nauthor Name: " + authorName +
                "\nauthor Last Name: " + authorLastName +
                "\nage: " + age;
    }
}
