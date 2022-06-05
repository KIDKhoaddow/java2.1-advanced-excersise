package Exercise;

public class Triangle extends Shape{
    protected  double side1=1.0,side2=1.0,side3=1.0;
    public Triangle(){}
    public Triangle(double side1,double side2,double side3,String color,boolean filled ){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public  void setSide(double side1,double side2, double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }
    public  double[] getSide(){
        double[] array ={this.side1,this.side2,this.side3};
        return array;
    }
    public double getArea(){
        double sum1=this.side1+this.side2+this.side3;
        double sum2=this.side1+this.side2-this.side3;
        double sum3=this.side1-this.side2+this.side3;
        double sum4=-this.side1+this.side2+this.side3;
        return  (Math.pow((sum1*sum2*sum3*sum4),0.5)/4);
    }
    public  double getPerimeter(){
        double sumSide=getSide1()+getSide2()+getSide3();
        return sumSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +"\n"+
                "side1=" + side1 +",\n"+
                "side2=" + side2 +",\n"+
                "side3=" + side3 +",\n"+
                "Area=" + getArea() +",\n"+
                "Perimeter=" + getPerimeter() +",\n"+
                "}\n"+
                super.toString();
    }
}
