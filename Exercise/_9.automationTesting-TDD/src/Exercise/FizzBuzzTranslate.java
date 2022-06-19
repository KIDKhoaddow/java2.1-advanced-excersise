package Exercise;

public class FizzBuzzTranslate {
    public  static  String translate(int inputNumber){
        boolean isDivisionByFifteen=inputNumber%15==0;
        boolean isDivisionByThree=inputNumber%3==0;
        boolean isDivisionByFive=inputNumber%5==0;
        if(isDivisionByFifteen){
            return "FizzBuzz";
        } else if (isDivisionByFive) {
            return  "Buzz";
        } else if (isDivisionByThree) {
            return  "Fizz";
        }else return null;

    }
}
