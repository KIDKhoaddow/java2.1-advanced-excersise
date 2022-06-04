package Exercise;

public class Main {
    public static void main(String[] args) {
        Student.setCollege();


        Student s1=new Student(111,"Hoàng");
        Student s2=new Student(112,"Khánh");
        Student s3=new Student(113,"Nam");

        System.out.println( s1.toString());
        System.out.println( s2.toString());
        System.out.println( s3.toString());
    }
}
