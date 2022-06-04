package Exercise;

import java.sql.Array;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        int size;
        ExserciseA exserciseA=new ExserciseA();
        Scanner scanner = new Scanner(System.in);
        int[] array={1,2,3,4,5,6,2,1,5,5,12,2};
        int[] array1={1,5,4,8,5,6,9};
        int[][] array3={{1,2,3},{2,3,1},{7,8,9}};
//        System.out.println(exserciseA.addElementToArray(array,5,12));
//        System.out.println(exserciseA.sumArray(array,array1));
//        System.out.println(exserciseA.findMaxFromArray(array3));

//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 30)
//                System.out.println("Size should not exceed 30");
//        } while (size > 30);
//        Student[] students=new Student[size];
//
//        for (int i = 0; i <students.length; i++) {
//            System.out.println("Enter a name for student " + (i + 1) + ": ");
//            String name = scanner.next();
//
//            System.out.println("Enter a mark for student " + (i + 1) + ": ");
//
//            double score= scanner.nextDouble();
//            students[i]=new Student(name,score);
//        }
//        for (int i = 0; i <students.length ; i++) {
//            double a= students[i].getScore();
//            System.out.println(a);
//        }
//
//        int count=0;
//        boolean check=true;
//        for (int i = 2; ; i++) {
//            for (int j = 2; j < i ; j++) {
//                if (i % j==0){
//                    check = false;
//                    break;
//                }
//
//            }
//
//            if (check) {
//                count += 1;
//                System.out.println(i); }
//            if ( count == 20) { break;}
//
//        }

        System.out.print(exserciseA.sumNumberFromColumnOfArray(array3,1));


    }
}
