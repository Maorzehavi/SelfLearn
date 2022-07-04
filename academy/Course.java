package academy;

public class Course {
    private String courseName;
    private String instructorName;
    private Student[] students;
    private int studentsNumber;

    public Course(String courseName, String instructorName, int studentsNumber) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.studentsNumber = 0;
        students = new Student[studentsNumber];
    }

    public boolean isRegistered(Student student) {
        boolean result = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) result = true;
        }
        return result;
    }

    public void register(Student student) {
        if (studentsNumber < students.length) {
            students[studentsNumber++] = student;
            System.out.println("you are successfully registered");
        } else {
            System.out.println("we cant get you to our academy");
        }
    }
    public String toString(){
        String course ="course name: "+courseName+"\ninstructor name: "+instructorName;
        String students= "\nstudents: \n";
        for (int i = 0; i < studentsNumber; i++) {
            students+= this.students[i].toString()+"\n";
        }
        return course+" "+students;
    }

    public int countAdultStudents(){
        int count =0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getClass()==AdultStudent.class){
                count++;
            }
        }
        return count;
    }
}
