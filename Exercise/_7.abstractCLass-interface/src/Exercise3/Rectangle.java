package Exercise3;

public class Rectangle implements Resizeable{
    private  double longs=2.0 ,width=1.0;

    public Rectangle(double longs, double width) {
        this.longs = longs;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longs=" + longs +
                ", width=" + width +
                '}';
    }

    @Override
    public  void  resize(){
        double percent=Math.random()*101-1;
        this.longs=this.longs*percent/100;
        this.width=this.width*percent/100;
    }
}
