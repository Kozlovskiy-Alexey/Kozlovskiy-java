package lessons.lesson07;

public abstract class Profession {
    String professionName;
    String industry;

    public Profession(String professionName, String industry) {
        this.professionName = professionName;
        this.industry = industry;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void doJob();

    @Override
    public String toString() {
        return "Profession Info" +
                "\nProfession Name: " + professionName +
                "\nIndustry:" + industry + "\n";
    }

    public static class Developer extends Profession {

        private String speciality;

        public Developer(String professionName, String industry, String speciality) {
            super(professionName, industry);
            this.speciality = speciality;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        @Override
        public void doJob() {
            System.out.println("Developer writes code...");
        }

        @Override
        public String toString() {
            return "Profession Info" +
                    "\nProfession Name: " + professionName +
                    "\nIndustry:" + industry +
                    "\nSpeciality: " + speciality + "\n";
        }


    }
}
