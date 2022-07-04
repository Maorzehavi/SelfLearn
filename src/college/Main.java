package college;

public class Main {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("101", 69);
        cs.updateWork(1, 80);
        cs.updateWork(2, 60);
        cs.updateWork(3, 70);
        cs.updateWork(4, 68);
        cs.updateWork(5, 83);
        cs.show();
    }
}