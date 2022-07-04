package circus;

public class FireSpitter extends CircusEmployee {
    private int spitDistance;
    private int spitCount;

    public FireSpitter(String name, String id, int spitDistance, int spitCount) {
        super(name, id);
        this.spitDistance = spitDistance;
        this.spitCount = spitCount;
    }

    @Override
    public int calculateSalary() {
        return spitCount*spitDistance*30;
    }

    @Override
    public boolean continueToNextShow() {
        return spitDistance>1?true:false;
    }

    public int getSpitDistance() {
        return spitDistance;
    }

    public void setSpitDistance(int spitDistance) {
        this.spitDistance = spitDistance;
    }

    public int getSpitCount() {
        return spitCount;
    }

    public void setSpitCount(int spitCount) {
        this.spitCount = spitCount;
    }
}
