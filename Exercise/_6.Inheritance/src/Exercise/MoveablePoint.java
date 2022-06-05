package Exercise;

public class MoveablePoint extends Point2D{
    private  float xSpeed=0.0f;
    private  float ySpeed=0.0f;

    public  MoveablePoint(){
    }

    public  MoveablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public  void  setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
     public float[] getSpeed(){
        float[] array= {this.xSpeed,this.ySpeed};
        return  array;
     }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ",ySpeed=" + ySpeed +
                "}"
                ;
    }
    public MoveablePoint move(){
        super.x+=this.xSpeed;
        super.y+=this.ySpeed;
        return this;
    }

}
