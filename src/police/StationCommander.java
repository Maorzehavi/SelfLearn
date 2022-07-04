package police;

public class StationCommander extends Cop{
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public void updateSeniority() {
        super.seniority +=2;
    }

    public StationCommander(String name, String id, int seniority, String rank) {
        super(name, id, seniority);
        this.rank=rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nrank: "+rank;
    }
}
