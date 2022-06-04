package Exercise;

public class Rectangle {
    private double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public  Rectangle(double width) {
        this.width = width;
    }

    public Rectangle() {

    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }
    public  double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}
