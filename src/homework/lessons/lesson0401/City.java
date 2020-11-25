package homework.lessons.lesson0401;

public class City {
    public static void main(String[] args) {

        Building businessCenter1 = new Building(1980, 20, "reinforce concrete", true);
        businessCenter1.buildingAddress = new BuildingAddress("Partizansky.ave", 150);
        businessCenter1.industrialPurpose = IndustrialPurpose.OFFICE;
        System.out.println(businessCenter1.industrialPurpose);

        businessCenter1.setEarOfConstruction(1981);
        businessCenter1.setElevator(false);
        businessCenter1.industrialPurpose = IndustrialPurpose.RESIDENTIAL;
        System.out.println(businessCenter1.industrialPurpose);

    }
}
