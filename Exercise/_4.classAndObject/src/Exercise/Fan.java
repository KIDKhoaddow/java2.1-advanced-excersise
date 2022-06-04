package Exercise;

public class Fan {
   private final int  SLOW=1 ,MEDIUM=2,FAST=3;
   private int speed=1;
   private boolean status=false;
   private double radius=5;
   private String color="blue";

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public Fan(int speed, boolean status, double radius) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;

    }
    public Fan(int speed, boolean status, String color) {
        this.speed = speed;
        this.status = status;
        this.color = color;
    }
    public Fan(int speed,  double radius, String color) {
        this.speed = speed;

        this.radius = radius;
        this.color = color;
    }
    public Fan( boolean status, double radius, String color) {
        this.status = status;
        this.radius = radius;
        this.color = color;
    }
    public Fan(int speed, boolean status) {
        this.speed = speed;
        this.status = status;
    }
    public Fan(int speed, double radius) {
        this.speed = speed;
        this.radius = radius;
    }
    public Fan( boolean status, double radius) {
        this.status = status;
        this.radius = radius;
    }
    public Fan(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public Fan( boolean status, String color) {
        this.status = status;
        this.color = color;
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(status){
            return "Fan{" +
                "speed=" + speed +
                ", status= fan is on" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
            }
        else {
            return "Fan{" +
                    "speed=" + speed +
                    ", status= fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }
}
