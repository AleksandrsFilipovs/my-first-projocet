package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {
        // byte date of type
        byte myCurrentAge = 27;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        // char  data type
        char firstNameLetter = 97; // 'N'
        System.out.println(firstNameLetter);

        // int data type
        int dateOfBirth = 290695;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        // float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        // double data type
        double weight  = 93.50;
        System.out.println(weight);

        // boolean is; his;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        System.out.printf("%s %s %s\n", isSpring, isWinter, hasApples);

        // string
        String name = "Alex";
        String surName = "Filipovs";

        // concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        //System.out.println(fullNameWithAge);
        // Alex Filipovs27


        System.out.printf("My full name is : %s. I am %d years old.%n", fullName, myCurrentAge);
        System.out.printf("My full name is : %s. I am %d years old.\n", fullName, myCurrentAge);

        // *
        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        // division
        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(result);
        // %
        int number = 10 % 5;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        /*for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println("This is even numbers: " + numbers[i]);
            }
        } */
        for(int num: numbers) {
            if(num % 2 ==0) {
                System.out.println("This is even numbers: " + num);
            }
        }
    }
}
