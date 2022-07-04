package college;

public class Student {
    private String ID;
    private int[] workGrades;
    public Student(String id) {
        this.ID = id;
        this.workGrades = new int[5];
    }

    public void updateWork(int work, int grade) {
        this.workGrades[work - 1] = grade;
    }

    public double computeAvg() {
        double sum = 0;
        for (int i = 0; i < workGrades.length; i++)
            sum += workGrades[i];
        return sum / workGrades.length;
    }

    public void show() {
        System.out.println("Student ID:" + ID);
        System.out.println("Work grades:");
        for (int i = 0; i < workGrades.length; i++)
            System.out.println(i + 1 + " : " + workGrades[i]);
    }
}
