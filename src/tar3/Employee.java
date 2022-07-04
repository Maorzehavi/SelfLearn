package tar3;

public class Employee {
    private String name, id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("In Employee’s constructor!");
    }

    public void show() {
        System.out.println("\nname : " + getName() + "\nid : " + getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
