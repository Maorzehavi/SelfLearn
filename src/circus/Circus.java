package circus;

public class Circus {
    private CircusEmployee[] circusEmployees;
    private int employeesNumber = 0;
    public Circus(int employeesNumber){
        this.circusEmployees = new CircusEmployee[employeesNumber];
    }

    public void addEmployee(CircusEmployee employee) {
        this.circusEmployees[employeesNumber++] = employee;
    }

    public int calculateTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < employeesNumber; i++) {
            totalSalary+=circusEmployees[i].calculateSalary();
        }
        return totalSalary;
    }
    public int noOfEmployeesForNextShow(){
        int count = 0;
        for (int i = 0; i < circusEmployees.length; i++) {
            if (circusEmployees[i].continueToNextShow()) {
                count++;
            }
        }
        return count;
    }

}
