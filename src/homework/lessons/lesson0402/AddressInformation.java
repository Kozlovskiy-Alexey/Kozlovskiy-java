package homework.lessons.lesson0402;

public class AddressInformation {
    private int zipCode;
    private String city;
    private String street;

    public AddressInformation(int zipCode, String city, String street) {
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
    }

    public void getAddressInformation() {
        System.out.printf("zip cod: %d city: %s street: %s \n", zipCode, city, street);

    }
}

