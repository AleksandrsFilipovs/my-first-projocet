package lv.acodemy.homeworks;

import java.util.Scanner;
import java.util.Arrays;

public class SecondHomeWork {
    public static void main(String[] args) {
        String [] country = {"Latvia", "Estonia", "Lithuania", "Georgia", "Russia",  "Germany", "Turkey", "Poland", "Norway", "Spain"};


        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);
        } if(!country.equals("Lavtia")) {
            System.out.println("Latvia is my motherland");
        }

        String [] sentence  = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday,", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code."};

        System.out.println(Arrays.toString(sentence));



            /*
            if(5000=>)
            if else (5000 10000)
            else
             */

        int salary  = 5000;
        if (salary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (salary <= 10000) {
            System.out.println("Your salary is average.");
        } else {
            System.out.println("Your salary is high.");
        }


        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }



    }
}
