package tar3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("maya","001");
        Employee employee2 = new Employee("moran","002");
        Employee employee3 = new Employee("maor","003");
        Lecturer lecturer1 = new Lecturer("lihi","010");
        Lecturer lecturer2 = new Lecturer("levi","020");
        lecturer1.addCourse("math");
        lecturer1.addCourse("sport");
        lecturer2.addCourse("hebrow");
        lecturer2.addCourse("english");
        Dean dean = new Dean("dalia","100");
        dean.addLecturer(lecturer1);
        dean.addLecturer(lecturer2);
        dean.addCourse("test");
        dean.show();
    }
}
