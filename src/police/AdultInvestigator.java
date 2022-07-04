package police;

public class AdultInvestigator extends Investigator{

    @Override
    public int calculateSalary() {
        return super.calculateSalary()+800;
    }

    public AdultInvestigator(String name, String id, int seniority, String trainPlace, String address) {
        super(name, id, seniority, trainPlace, address);

    }
}
