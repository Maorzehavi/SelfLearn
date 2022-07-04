package school;

import java.util.ArrayList;

public class Student {
    private String fullName;
    private final String id;
    private ArrayList<Integer> testGrades;
    private int testNumber;
    private double avg;

    public Student(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
        this.testGrades = new ArrayList<Integer>();
    }

    public String toString() {
        return "Name: " + getFullName() + "\nId: " + getId();
    }

    public void printGrades() {
        int count = 0;
        for (Integer testGrade : this.testGrades) {
            System.out.println("Test number " + (count + 1) + ": " + testGrade);

        }
    }

    public double getAvg() {
        int count = 0;
        for (int i = 0; i < testGrades.size(); i++) {
            if (testGrades.get(i) != 0) this.avg += testGrades.get(count++);

        }
        return avg / count;
    }

    public ArrayList<Integer> getGrades() {
        return testGrades;
    }

    public void setGrade(int grade) {
        this.testGrades.add(testNumber++, grade);
    }


    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return this.id;
    }
}
