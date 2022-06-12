package Exercise;

public class NextDayCalculator {
   public static String CalculateNextDay(int day,int month ,int year){
       return calculateNextDayNormalYear(day ,month,year,isLeapYear(year));
   }
   private  static  boolean isLeapYear(int year){
       if(year%400==0){
           return true;
       }
       if(year%4==0&&year%100!=0){
           return  true;
       }
       return false;
   }

   private static  String calculateNextDayNormalYear(int day,int month,int year,boolean isLeapYear){
           switch (month){
               case 1 :
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12 :
                   return decideNextDay(day,month,year,31);
               case 4   :
               case 6   :
               case 9   :
               case 11  :
                   return decideNextDay(day,month,year,30);
               case 2:
                   if(isLeapYear){
                       return decideNextDay(day , month,year ,29);
                   }
                   else {
                       return decideNextDay(day , month,year ,28);
                   }
           }
       return null;
   }


    private  static  String decideNextDay(int day , int month , int year,int number){
        if(day<number){
            return "year : "+year+", month : "+month+", day : "+(day+1);
        }else if(day==number && month<12){
            return "year : "+year+", month : "+(month+1)+" , day : 1";
        }else
            return "year : "+(year+1)+ ", month : 1, day : 1";
    }
}
