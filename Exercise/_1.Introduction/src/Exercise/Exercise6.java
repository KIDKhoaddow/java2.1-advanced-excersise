package Exercise;

public class Exercise6 {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0||year%4==0) {
           return true;
        }
        else return  false  ;
    }
}
