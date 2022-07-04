package school;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Student {
    Student[] students;
    private int numberOfStudent;
    private String[] courses;

    public Student[] getStudents() {
        return students;
    }

    private int numberOfCourses;

    public Teacher(String fullName, String id, int numberOfCourses) {
        super(fullName, id);
        courses = new String[numberOfCourses];
        this.numberOfCourses = 0;
        this.numberOfStudent = 0;
        this.students = new Student[3];
        Arrays.fill(courses, "");
    }

    public void addStudent(Student student) {
        this.students[this.numberOfStudent++] = student;
    }

    public void addCourse(String courseName) {
        this.courses[this.numberOfCourses++] = courseName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCourses: " + Arrays.toString(this.courses);

    }

}
