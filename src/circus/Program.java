package circus;

public class Program {
    public static void main(String[] args) {
        Circus mederano = new Circus(3);
        mederano.addEmployee(new Clown("john","5451",60));
        mederano.addEmployee(new Clown("john","5451",60));
        mederano.addEmployee(new RopeWalker("john","5451",10,30));
        System.out.println(mederano.calculateTotalSalary());


    }
}
