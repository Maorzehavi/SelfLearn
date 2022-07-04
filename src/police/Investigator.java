package police;

public class Investigator extends Cop {
    private String trainPlace;
    private String address;
    public Investigator(String name, String id, int seniority,String trainPlace,String address) {
        super(name, id, seniority);
        this.address=address;
        this.trainPlace=trainPlace;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary()-seniority*1000+ 3000+(super.seniority*500);
    }

    @Override
    public String toString() {
        return super.toString()+"\nTraining place: "+trainPlace+"\nAddress: "+address;
    }
}
