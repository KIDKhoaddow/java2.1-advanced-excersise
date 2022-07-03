package view.Common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonView {
    public  int inputInt(String string, Scanner scanner){
        System.out.print(string);
        return scanner.nextInt();
    }
    public int inputInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public  String inputString (String string , Scanner scanner){
        System.out.print(string);
        return  scanner.next();
    }
    public String inputString(Scanner scanner){
        return scanner.next();
    }
    public  double inputDouble(String string , Scanner scanner){
        System.out.println(string);
        return scanner.nextDouble();
    }
    public  void  showMessage(String string){
        System.out.println(string);
    }
    public boolean isInputString(String string) {
        return Pattern.matches("[a-z0-9_-]{6,}", string);
    }


    public void displayObject(Object user) {
        System.out.println(user);
    }
}
