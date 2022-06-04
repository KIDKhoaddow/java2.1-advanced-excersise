package Exercise;

public class ExerciseA {
    public boolean isPrime(int number){
        if(number<2){
            return false;
        }
        else{
            int i=2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false ;
                }
                i++;
            }
            return true;
        }
    }



    public double calculateInterest(double money,int month, double interestRate){
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        return totalInterest;
    }


    public int greateCommonFactor(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return  a;

    }
    public void displayPrime(){
        int count =0;
        int number=0;
        while (count<20){
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
    public void displayPrimeLessThan100(){
        int number=0;
        while (number<100){
            if(isPrime(number)){
                System.out.println(number);
            }
            number++;
        }

    }

}


