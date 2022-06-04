package Exercise;

public class QuadraticEquation {
    private double factor1,factor2,factor3;

    public QuadraticEquation(double factor1, double factor2, double factor3) {
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.factor3 = factor3;
    }
    public QuadraticEquation(double factor1, double factor2) {
        this.factor1 = factor1;
        this.factor2 = factor2;

    }
    public QuadraticEquation(double factor1) {
        this.factor1 = factor1;

    }
    public QuadraticEquation() {

    }

    public double getFactor1() {
        return factor1;
    }

    public void setFactor1(double factor1) {
        this.factor1 = factor1;
    }

    public double getFactor2() {
        return factor2;
    }

    public void setFactor2(double factor2) {
        this.factor2 = factor2;
    }

    public double getFactor3() {
        return factor3;
    }

    public void setFactor3(double factor3) {
        this.factor3 = factor3;
    }
    public double getDiscrimminant(){
        return Math.pow( this.factor2,2)-4*factor1*factor3;
    }

    public  double getRoot1() {
        return (-this.factor2+Math.pow(getDiscrimminant(),0.5))/2/factor1;
    }

    public  double getRoot2() {
        return (-this.factor2-Math.pow(getDiscrimminant(),0.5))/2/factor1;
    }


}


