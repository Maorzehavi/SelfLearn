package academy;

public class AdultStudent extends Student {
    private int birthYear;

    public AdultStudent(String name, String address, int birthYear) {
        super(name, address);
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Student student) {
        return super.equals(student);
    }

    @Override
    public String toString() {
        return super.toString() + "\nbirth year: " + birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
