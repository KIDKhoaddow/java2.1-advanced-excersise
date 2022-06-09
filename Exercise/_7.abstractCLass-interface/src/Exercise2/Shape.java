package Exercise2;

public class Shape {
    protected  String color;
    protected  boolean filled ;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        this.color = "green";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Exercise.Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
