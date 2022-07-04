package college;

public class CollegeStudent extends Student {
    private int testGrade;

    public CollegeStudent(String id, int testGrade) {
        super(id);
        this.testGrade=testGrade;

    }

    @Override
    public double computeAvg() {
       return (testGrade*0.8+super.computeAvg()*0.2);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("test : "+testGrade+"\navg : "+computeAvg());
    }
}
