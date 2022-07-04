package police;

public class Cop {
    private String name;
    private final String id;

    public String getName() {
        return name;
    }

    protected int seniority;


    public Cop(String name, String id, int seniority) {
        this.name = name;
        this.id = id;
        this.seniority = seniority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateSeniority() {
        this.seniority ++;
    }

    public int calculateSalary() {
        return 5000 + (seniority * 1000);
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nSeniority: " + seniority + "\nSalary: " + calculateSalary();
    }
}
