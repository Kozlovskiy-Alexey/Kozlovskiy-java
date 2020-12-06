package lessons.lesson07.lesson0703;

class Developer {
    private String speciality = "Developer";

    int id;
    String name;

    Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void displaySpeciality() {
        System.out.println("Speciality: " + speciality);
    }
}
