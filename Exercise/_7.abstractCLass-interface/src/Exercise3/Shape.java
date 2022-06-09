package Exercise3;

public class Shape {
    private boolean filled =false;

    public Shape() {
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                '}';
    }
}
