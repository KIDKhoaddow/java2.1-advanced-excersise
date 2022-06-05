package Exercise;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);


//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//
//
//        Cylinder cylinder= new Cylinder();
//        System.out.println(cylinder);
//
//        cylinder= new Cylinder(62,25,"red",true);
//        System.out.println(cylinder);

//
//        Point3D point3D=new Point3D();
//        System.out.println(point3D);
//
//       point3D=new Point3D(2,3,5);
//        System.out.println(point3D);


        MoveablePoint moveablePoint=new MoveablePoint(26,35);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);


        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle(20,25,30,"red",true);
        System.out.println(triangle);

    }
}
