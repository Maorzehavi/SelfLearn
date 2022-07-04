package academy;

public class FlowerStudent extends Student {
    private int classNumber;
    private String schoolName;

    public FlowerStudent(String name, String address, int classNumber, String schoolName) {
        super(name, address);
        this.classNumber = classNumber;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nclass number: " + classNumber + "\nschool name: " + schoolName;
    }

    @Override
    public boolean equals(Student student) {
        return super.equals(student);
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
