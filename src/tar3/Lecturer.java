package tar3;

import java.util.Arrays;

public class Lecturer extends Employee {
    private String[] courses;

    private int numOfCourses;

    @Override
    public void show() {
        super.show();
        System.out.print("Lecturer courses : ");
            for (String i : courses) {
                System.out.print(i+" ");

        }
    }

    public String getId() {
        return super.getId();
    }

    public Lecturer(String name, String id) {
        super(name, id);
        courses = new String[10];
        this.courses = courses;
        numOfCourses = 0;
        System.out.println("In Lecturer’s constructor!");

    }

    public void addCourse(String course) {
        this.courses[this.numOfCourses] = course;
        numOfCourses++;

    }
}
