package circus;

public  class Clown extends CircusEmployee {
    private int laughed;

    public Clown(String name, String id, int laughs) {
        super(name, id);
        this.laughed = laughs;
    }

    @Override
    public int calculateSalary() {
        return laughed*100;
    }

    @Override
    public boolean continueToNextShow() {
       return laughed>0?true:false;
    }

    public int getLaughed() {
        return laughed;
    }

    public void setLaughed(int laughed) {
        this.laughed = laughed;
    }


}
