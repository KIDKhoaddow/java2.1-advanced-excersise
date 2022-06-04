package Exercise;

public class Point2D {
    protected  float x=0.0f;
    protected  float y=0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public  float[] getXY(float x, float y){
        float[] array={x,y};
        return  array;
    }


    public  String toString(){
        return "A Exercise.Point2D with x = "
                + getX()
                +"y = "+getY();
    }
}
