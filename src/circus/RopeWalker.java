package circus;

public class RopeWalker extends CircusEmployee{
    private int shoesNumber;
    private int claps;
    public RopeWalker(String name, String id, int shoesNumber, int claps) {
        super(name, id);
        this.shoesNumber=shoesNumber;
        this.claps=claps;
    }

    @Override
    public int calculateSalary() {
        return shoesNumber*150;
    }

    @Override
    public boolean continueToNextShow() {
        return claps>0?true:false;
    }

    public int getShoesNumber() {
        return shoesNumber;
    }

    public void setShoesNumber(int shoesNumber) {
        this.shoesNumber = shoesNumber;
    }

    public int getClaps() {
        return claps;
    }

    public void setClaps(int claps) {
        this.claps = claps;
    }
}
