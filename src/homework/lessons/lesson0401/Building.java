package homework.lessons.lesson0401;


public class Building {
    /* 1. Опишите (то есть создайте класс, описывающий…)
    сущность Building (Здание). Здание можно охарактеризовать назначением
    (например, жилой дом, офисное здание, промышленный объект, хоз.
    постройка и т.д.), адресом, количеством этажей, наличием(или отсутствием)
    лифта, материалом, из которого оно построено, годом постройки.
    Адрес состоит из улицы и номера дома.
    Создайте в другом классе несколько объектов класса Building*/

    private int earOfConstruction;
    private int numberOfFloors;
    private String material;
    private boolean elevator;
    BuildingAddress buildingAddress;
    IndustrialPurpose industrialPurpose;

    public Building(int earOfConstruction, int numberOfFloors, String material, boolean elevator) {
        this.earOfConstruction = earOfConstruction;
        this.numberOfFloors = numberOfFloors;
        this.material = material;
        this.elevator = elevator;
    }

    public int getEarOfConstruction() {
        return earOfConstruction;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isElevator() {
        return elevator;
    }

    public void setEarOfConstruction(int earOfConstruction) {
        this.earOfConstruction = earOfConstruction;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }
}
