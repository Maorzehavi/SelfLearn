package tar3;

import java.util.Arrays;

public class Dean extends Lecturer {
    Lecturer[] lecturer;
    int numOfLecturers;

    public Dean(String name, String id) {
        super(name, id);
        this.lecturer = new Lecturer[10];
        this.numOfLecturers = 0;
        System.out.print("In Dean’s constructor!");
    }

    public void addLecturer(Lecturer lecturer) {
        this.lecturer[numOfLecturers] = lecturer;
        numOfLecturers++;
    }

    @Override
    public void show() {
        super.show();
        System.out.print("Dean lecturers : ");
        for (int i = 0; i < numOfLecturers; i++) {
            this.lecturer[i].show();
        }
    }
}
