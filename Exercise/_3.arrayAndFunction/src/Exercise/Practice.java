package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    Scanner input = new Scanner(System.in);

    public boolean isSizeExceed(int size) {
        if (size > 20) {
            return false;
        } else {
            return true;
        }
    }

    public void inputArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
    }

    public void displayArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public void reverseArray(int arrayIn[]) {
        for (int j = 0; j < arrayIn.length / 2; j++) {
            int temp = arrayIn[j];
            arrayIn[j] = arrayIn[arrayIn.length - 1 - j];
            arrayIn[arrayIn.length - 1 - j] = temp;
        }
    }

    public boolean isExist(String name, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int findMaxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findIndexNumberInArray(int[] array, int number) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
            }
        }
        return index;
    }


    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public void displayChoice() {
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }

    public void makeAChoice(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("Enter fahrenheit: ");
                double fahrenheit = input.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            }
            case 2: {
                System.out.println("Enter Celsius: ");
                double celsius = input.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            }
            case 0:
                System.exit(0);
        }
    }
    public int minValue(int[] array){
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }






}
