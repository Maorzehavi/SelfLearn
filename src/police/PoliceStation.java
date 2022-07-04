package police;

import java.util.ArrayList;
public class PoliceStation {
    private ArrayList<Cop> cops;

    public PoliceStation(int cops) {
        this.cops = new ArrayList<Cop>();
    }

    public void addCop(Cop cop) {
        cops.add(cop);
    }

    public Cop searchCop(String name) {
        for (int i = 0; i < cops.size(); i++) {
            if (this.cops.get(i).getName().equals(name)) {
                System.out.println(cops.get(i));
                return cops.get(i);

            }
        }
            return null;
    }


    public void updateSeniority() {
        for (int i = 0; i < cops.size(); i++) {
            cops.get(i).updateSeniority();
        }
    }

    public void maxSalary() {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < cops.size(); i++) {
            if (cops.get(i).calculateSalary() > max) {
                max = cops.get(i).calculateSalary();
                temp = i;
            }
        }
        System.out.println(cops.get(temp).getName() + " got the biggest salary");
    }

    public void allCops(){
        for (Cop cop : cops) {
            System.out.println(cop+"\n");
        }
    }
}


