package Exercise;

public class Practice {
    public void displayName(String name){
        System.out.println("Hello: " + name);
    }

    public  void displayNumber(int number){
        int hundreds;
        int dozens;
        int unit;
        if(number>=0 && number<10){
           returnUnit(number);
        }else if(number>=10&&number<20) {
            returnUnitSpecial(number);
        }
        else if(number>=20&&number<100){
            dozens=number/10;
            returnDozens(dozens);
            unit=number%10;
            returnUnit(unit);
        }
        else if(number>=100&&number<1000){
            hundreds=number/100;
            dozens = number - hundreds*100;
            returnUnit(hundreds);
            System.out.print("hundred ");
            if(dozens<10){
                returnUnit(dozens);
            }
            else if(dozens>=10&&dozens<20) {
                returnUnitSpecial(dozens);
            }
            else if (dozens>=20&&dozens<99) {
                unit=dozens%10;
                dozens=dozens/10;
                returnDozens(dozens);
                returnUnit(unit);
            }
        }
    }

    public  void  returnDozens(int number){
        switch (number){
            case 2: System.out.print("twenty ");break;
            case 3: System.out.print("thirty ");break;
            case 4: System.out.print("forty ");break;
            case 5: System.out.print("thurty ");break;
            case 6: System.out.print("sixty ");break;
            case 7: System.out.print("seventy ");break;
            case 8: System.out.print("eighty ");break;
            case 9: System.out.print("ninety ");break;
        }
    }

    public  void returnUnitSpecial(int number){
        switch (number) {
            case 10:
                System.out.println("ten ");break;
            case 11:
                System.out.println("eleven ");break;
            case 12:
                System.out.println("second ");break;
            case 13:
                System.out.println("thirteen ");break;
            case 14:
                System.out.println("fourteen ");break;
            case 15:
                System.out.println("fifteen ");break;
            case 16:
                System.out.println("sixteen ");break;
            case 17:
                System.out.println("seventeen ");break;
            case 18:
                System.out.println("eighteen ");break;
            case 19:
                System.out.println("nineteen ");break;
        }

    }

    public  void returnUnit(int number){

        switch (number){
            case  1: System.out.print("one ");break;
            case  2: System.out.print("two ");break;
            case  3: System.out.print("three ");break;
            case  4: System.out.print("four ");break;
            case  5: System.out.print("five ");break;
            case  6: System.out.print("six ");break;
            case  7: System.out.print("seven ");break;
            case  8: System.out.print("eight ");break;
            case  9: System.out.print("nine ");break;
        }
    }

    public double convertMoney(double usd){
        double vnd=23000;
        return usd*23000;
    }
}
