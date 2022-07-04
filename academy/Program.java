package academy;

public class Program {
    public static void main(String[] args) {
        AdultStudent adultStudent = new AdultStudent("yaron", "banana", 1999);
        AdultStudent adultStudent2 = new AdultStudent("ron", "orange", 1998);
        FlowerStudent flowerStudent = new FlowerStudent("john", "try", 9, "test");
        FlowerStudent flowerStudent2 = new FlowerStudent("johnny", "try", 11, "test");

        Course course = new Course("math","shay",4);
        course.register(adultStudent);
        course.register(adultStudent2);
        course.register(flowerStudent);
        course.register(flowerStudent2);
        System.out.println(course.countAdultStudents());
        System.out.println(course);
        System.out.println(course.isRegistered(adultStudent));    }
}
