package Exercise;

public class Circle extends Shape {
    private  double radius=1.0;

    public Circle(double radius, String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }
    public  double getArea(){
        return  (Math.pow(this.radius,2)*Math.PI);
    }
    public  double getPerimeter(){
        return  2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Exercise.Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }


}
