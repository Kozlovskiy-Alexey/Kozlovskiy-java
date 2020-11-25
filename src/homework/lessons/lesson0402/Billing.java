package homework.lessons.lesson0402;

public class Billing {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ATLANT", 19768, 10008745, 5005800);
        customer1.contractInformation = new ContractInformation();
        customer1.addressInformation = new AddressInformation(1000000,"Minsk","Pobediteley.ave.59");
        customer1.contractInformation.setCostOfTariff(20);
        customer1.contractInformation.setNumberOfContracts(500);
        customer1.contractInformation.setTariffPlan("Unlim");

        customer1.getInformationAboutCustomer();
        customer1.addressInformation.getAddressInformation();
        customer1.contractInformation.getContractInformation();
        customer1.contractInformation.charge();

    }
}
