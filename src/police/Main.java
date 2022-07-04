package police;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        PoliceStation policeStation = new PoliceStation(5);
        policeStation.addCop(new AdultInvestigator("maor","010",10,"home","tel-aviv"));
        policeStation.addCop(new YouthInvestigator("or","020",11,"home","tel-aviv",'y'));
        policeStation.addCop(new StationCommander("yaron","030",23,"alof"));
        policeStation.addCop(new PatrolCop("dan","040",5,"2212"));
        policeStation.addCop(new PatrolCop("shay","050",4,"554164"));
        policeStation.updateSeniority();
        policeStation.allCops();
        policeStation.maxSalary();

    }
}
