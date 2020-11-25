package homework.lessons.lesson0402;

public class ContractInformation {
    private String tariffPlan;
    private int numberOfContracts;
    private int costOfTariff;

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public void setCostOfTariff(int costOfTariff) {
        this.costOfTariff = costOfTariff;
    }

    public void charge() {
        System.out.println("Charge in current period is: " + numberOfContracts * costOfTariff + " BYN");
    }

    public void getContractInformation() {
        System.out.println("tariff plan " + tariffPlan + " " + " number of contract: " + numberOfContracts + " cost of tarriff " + costOfTariff);
    }
}
