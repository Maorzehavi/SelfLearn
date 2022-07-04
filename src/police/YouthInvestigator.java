package police;

public class YouthInvestigator extends Investigator {
    private boolean specialTrain;

    public boolean isSpecialTrain() {
        return specialTrain;
    }

    public void setSpecialTrain(boolean specialTrain) {
        this.specialTrain = specialTrain;
    }

    @Override
    public void updateSeniority() {
        super.updateSeniority();
        if (specialTrain) {
            this.seniority++;

        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nspecial training: " + specialTrain;
    }

    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();
        if (specialTrain)
            salary += 700;
        return salary;
    }

    public YouthInvestigator(String name, String id, int seniority, String trainPlace, String address, char answer) {
        super(name, id, seniority, trainPlace, address);
        if (answer == 'y' || answer == 'Y') this.specialTrain = true;
        else if (answer == 'n' || answer == 'N') this.specialTrain = false;
        else System.out.println("something went wrong");


    }
}
