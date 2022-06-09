package Exercise3;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(100);
        Square square=new Square(100);
        Rectangle rectangle=new Rectangle(60,40);
        circle.resize();
        square.resize();
        rectangle.resize();
        System.out.println("Circle : "+circle.getRadius());
        System.out.println("Square : "+square.getSlide());
        System.out.println("Circle : "+rectangle);

        square.howToColor();
        System.out.println(square);

    }
}
