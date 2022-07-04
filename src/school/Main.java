package school;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dan", "001");
        student.setGrade(80);
        student.setGrade(90);
        student.setGrade(100);
        student.printGrades();
        System.out.println(student.getAvg());

    }
}

