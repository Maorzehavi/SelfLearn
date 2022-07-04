package circus;

public class LionTamar extends CircusEmployee{
    private int shows;
    public LionTamar(String name, String id, int shows) {
        super(name, id);
        this.shows=shows;
    }

    @Override
    public int calculateSalary() {
        return shows*180;
    }

    @Override
    public boolean continueToNextShow() {
        return shows>3?true:false;
    }

    public int getShows() {
        return shows;
    }

    public void setShows(int shows) {
        this.shows = shows;
    }
}
