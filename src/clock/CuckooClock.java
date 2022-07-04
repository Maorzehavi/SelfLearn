package clock;

public class CuckooClock extends Clock {
    String hourCuckoo;
    String halfHourCuckoo;

    public void setHourCuckoo(String hourCuckoo) {
        this.hourCuckoo = hourCuckoo;
    }

    public void setHalfHourCuckoo(String halfHourCuckoo) {
        this.halfHourCuckoo = halfHourCuckoo;
    }

    public CuckooClock(int h, int m) {
        super(h, m);
        this.hourCuckoo = "Hour Cuckoo";
        this.halfHourCuckoo = "Half Hour Cuckoo";
    }

    @Override
    public void tick() {
        super.tick();
        int times = 0;
        if (super.minutes == 0 && super.seconds == 0) {
            times = super.hours < 12 ? super.hours : super.hours - 12;
            for (int i = 0; i < times; i++) System.out.println(this.hourCuckoo);
        } else if (super.minutes == 30 && super.seconds == 0) System.out.println(this.halfHourCuckoo);
    }

    @Override
    public void showTime() {
        super.showTime();
    }
}
