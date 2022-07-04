package circus;

public abstract class CircusEmployee {
    private String name;
    private final String id;

    public CircusEmployee(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public abstract int calculateSalary() ;
    public abstract boolean continueToNextShow();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
