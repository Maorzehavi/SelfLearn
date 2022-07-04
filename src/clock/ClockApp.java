package clock;

public class ClockApp {
    public static void main(String[] args) {
        CuckooClock cuckooClock = new CuckooClock(14,50);

        cuckooClock.showTime();
        twoHours(cuckooClock);
        cuckooClock.showTime();

    }
    public static void twoHours(CuckooClock cuckooClock){
        for (int i=0;i<7200;i++) cuckooClock.tick();
    }

}
