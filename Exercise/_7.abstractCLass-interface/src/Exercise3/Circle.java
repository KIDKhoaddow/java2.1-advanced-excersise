package Exercise3;

public class Circle implements Resizeable {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public void resize(){
        double percent=Math.random()*101-1;
        this.radius= this.radius*percent/100;
    }
}
