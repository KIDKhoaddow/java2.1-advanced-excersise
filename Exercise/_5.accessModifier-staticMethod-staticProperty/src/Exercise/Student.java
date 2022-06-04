package Exercise;

public class Student {
    private int rollno;
    private  String name;
    private  String classes;
    private  static  String college="BBDIT";

    public Student(int rollno, String name,String classes) {
        this.rollno = rollno;
        this.name = name;
        this.classes=classes;
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public Student(int rollno) {
        this.rollno = rollno;
    }
    public Student(String name,String classes) {

        this.name = name;
        this.classes=classes;
    }


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege() {
        Student.college = "CODEGYM";
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name +
                ",college="+college+'\'' +
                '}';
    }
}
