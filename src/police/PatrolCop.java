package police;

public class PatrolCop extends Cop {
    private String serialNumber;

    @Override
    public String toString() {
        return super.toString() + "\nSerial number: " + serialNumber;
    }

    public PatrolCop(String name, String id, int seniority, String serialNumber) {
        super(name, id, seniority);
        this.serialNumber = serialNumber;
    }
}
