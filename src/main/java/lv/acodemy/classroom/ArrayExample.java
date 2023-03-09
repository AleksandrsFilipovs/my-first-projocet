package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[4]);

        int apples = numbers[6];
        System.out.println("I have " + apples + " apples");
        System.out.println("Number array contains of: " + numbers.length + " numbers");

        numbers[0] = 90;
        numbers[1] = 50;
        System.out.println(Arrays.toString(numbers));

       /* System.out.println(numbers[10]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        at lv.acodemy.classroom.ArrayExample.main(ArrayExample.java:19)
        */

        int[] euribor = new int[10];
        euribor[0] = 3;
        euribor[1] = 5;

        System.out.println(Arrays.toString(euribor));

        String[] names = {"John", "Andrew", "Mike", "Anna", "Marija"};
        System.out.println(names.length);
        System.out.println("My name is: " + names[2]);

        names[3] = "Mark";
        System.out.println(Arrays.toString(names));



    }
}
