package Exercise;

import java.util.Date;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Date now = new Date();
        Scanner scanner = new Scanner(System.in);
        Exercise1 exercise1 = new Exercise1();
        Exercise2 exercise2 = new Exercise2();
        Exercise3 exercise3 = new Exercise3();
        Exercise4 exercise4 = new Exercise4();
        Exercise5 exercise5 = new Exercise5();
        Exercise6 exercise6 = new Exercise6();
        Exercise7 exercise7 = new Exercise7();
        Practice practice   = new Practice();

        float width;
        float height;
        double a;
        double b;
        double c;
        int month;
//        System.out.println("Enter width: ");
//        width = scanner.nextFloat();//Nhập chiều rộng
//        System.out.println("Enter height: ");
//        height = scanner.nextFloat();//Nhập chiều dài
//        Ex1.presentTime(now.toString());


//        Ex2.printTypeOf();


//        System.out.println("Area is : "+Ex3.Area(width,height));


//        System.out.println("nhập a :");
//        a=scanner.nextDouble();
//        System.out.println("nhập b :");
//        b=scanner.nextDouble();
//        System.out.println("nhập c :");
//        c=scanner.nextDouble();
//        System.out.println(c);
//        Ex4.checkFirstEquation(a,b,c);
//
//
//        month = scanner.nextInt();
//        Ex5.printDayOfMonth(month);
//        if (Ex6.isLeapYear(2016)) {
//            System.out.printf("Dây là năm nhuận ");
//
//        } else {
//            System.out.printf("Dây không phải là năm nhuận");
//
//        }
//
//        Ex7.dispBMI(186,85);

//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        Pr.displayName(name);
//        while (true){
//            int test = scanner.nextInt();
//            Pr.displayNumber(test);
//        }
//
        System.out.println( practice.convertMoney(64));

    }
}