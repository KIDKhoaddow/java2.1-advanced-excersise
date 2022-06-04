package Exercise;

public class Main {
    public static void main(String[] args) {
        Student.setCollege();


        Student s1=new Student(111,"Hoàng");
        Student s2=new Student(112,"Khánh");
        Student s3=new Student(113,"Nam");

        Car car1=new Car("Mazda 3","Skyactiv 3");
        Car car2=new Car("Mazda 4","Skyactiv 6");
        Car car3=new Car("Mazda 5","Skyactiv 7");


        System.out.println( s1.toString());
        System.out.println( s2.toString());
        System.out.println( s3.toString());

        System.out.println(Car.numberOfCars);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);


        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);



    }
}
