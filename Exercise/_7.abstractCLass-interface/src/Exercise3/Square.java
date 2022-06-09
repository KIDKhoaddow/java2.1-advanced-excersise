package Exercise3;

public class Square extends Shape implements Resizeable,Colorable{
    private  double slide=1.0;

    public Square() {
    }

    public Square(double slide) {
        this.slide = slide;
    }

    public Square(double slide,boolean filled){
        super(filled);
        this.slide=slide;
    }
    public  Square(boolean filled){
        super(filled);
    }
    public double getSlide() {
        return this.slide;
    }

    public void setSlide(double slide) {
        this.slide = slide;
    }

    @Override
    public void howToColor(){
        super.setFilled(true);
    }

    @Override
    public  void  resize(){
        double percent=Math.random()*101-1;
        this.slide=this.slide*percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "slide=" + slide +"\n"+
                "color= Color all four sides"+
                '}';
    }
}
