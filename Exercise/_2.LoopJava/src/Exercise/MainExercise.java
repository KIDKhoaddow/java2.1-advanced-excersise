package Exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MenuApplication menuApplication=new MenuApplication();
        ExerciseA exerciseA=new ExerciseA();
//        menuApplication.printMenu();
//        int choice=input.nextInt();
//        menuApplication.choice(choice);
        exerciseA.displayPrime();
        exerciseA.displayPrimeLessThan100();

    }
}
