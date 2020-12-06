package lessons.lesson07.lesson0703;

import java.sql.SQLOutput;

class JavaDeveloper extends Developer {
   private String speciality = "Java Developer";
   private int phone;
   private String office;

   JavaDeveloper(int id, String name, int phone, String office){
      super(id, name);
      this.phone = phone;
      this.office = office;
   }



    @Override
    public void displaySpeciality() {
        System.out.println("Speciality: " + this.speciality);
    }

    public void demonstrateSuperKeyword() {
        JavaDeveloper javaDeveloper = new JavaDeveloper(3,"Vova",3536848,"Gomel");

        System.out.println("Getting subclass speciality");
        javaDeveloper.displaySpeciality();

        System.out.println("Getting superclass speciality:");
        super.displaySpeciality();
    }

}
