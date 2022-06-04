package Exercise;

public class Cylinder extends Circle{
    private  double height=22.0;


    public Cylinder(){
    }
    public Cylinder(double height,double radius, String color, boolean filled){
        super(radius, color, filled);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return  super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Exercise.Cylinder with volume="
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
