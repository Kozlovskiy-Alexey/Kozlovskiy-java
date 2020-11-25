package homework.lessons.lesson0402;

public class Customer {
    String companyName;
    private int id;
    private int unp;
    private int okpo;
    AddressInformation addressInformation;
    ContractInformation contractInformation;


    public Customer(String companyName, int id, int unp, int okpo) {
        this.companyName = companyName;
        this.id = id;
        this.unp = unp;
        this.okpo = okpo;
    }
    public void getInformationAboutCustomer() {
        System.out.println(companyName + " " + " id: "  + id + " UNP: " + unp + " OKPO: " + okpo);
    }
}
