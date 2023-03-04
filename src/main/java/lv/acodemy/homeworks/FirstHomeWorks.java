package lv.acodemy.homeworks;

public class FirstHomeWorks {
    public static void main(String[] args) {
        // Create 2 variable for each data type (meaningful)
        // Concatenation (write about myself)
        // Play with arithmetic operators (+, -, / .. )

        // byte data type
        byte ageOfMyDog = 2;
        System.out.println(ageOfMyDog);

        byte ageOfMyCat = 5;
        System.out.println(ageOfMyCat);

        byte myCurrentReset = 12;
        System.out.println(myCurrentReset);

        byte maxReset = 50;
        System.out.println(maxReset);

        // short data type
        short costOfMyDog = 1200;
        System.out.println(costOfMyDog);

        short costOfMyCat = 500;
        System.out.println(costOfMyCat);

        short myCurrentStats = 7200;
        System.out.println(myCurrentStats);

        short MaxStats = 32767;
        System.out.println(MaxStats);

        // char data type
        char firstLetterOfMyDogName = 83; // S (Selby)
        System.out.println(firstLetterOfMyDogName);

        char firstLetterOfCatName = 70; // F (Fox)
        System.out.println(firstLetterOfCatName);

        char myFavoriteCharacter = 69; // E (Elf)
        System.out.println(myFavoriteCharacter);

        char notMyFavoriteCharacter = 87; // W (Wizard)
        System.out.println(notMyFavoriteCharacter);

        // int data type
        int myDogDateOfBirth = 11012021;
        System.out.println(myDogDateOfBirth);

        int myCatDateOfBirth = 15022018;
        System.out.println(myCatDateOfBirth);

        int myGameBalance = 25000000;
        System.out.println(myGameBalance);

        int myBalanceAfterReset = 22500000;
        System.out.println(myBalanceAfterReset);

        // long data type
        long dogsPopulation = 470000000;
        System.out.println(dogsPopulation);

        long catsPopulation = 600000000;
        System.out.println(catsPopulation);

        //flout data type
        float myRecord = 22.22F;
        System.out.println(myRecord);

        float serverRecord = 34.12f;
        System.out.println(serverRecord);

        // double data type
        double myDogWeight = 11.00;
        System.out.println(myDogWeight);

        double myChildrenWeight = 13.00;
        System.out.println(myChildrenWeight);

        //boolean is; his;
        boolean hasBow = true;
        boolean hasStaff = false;
        boolean isNight = true;
        boolean isDay = false;

        System.out.printf("%s, %s, %s, %s\n", hasBow, hasStaff, isNight, isDay);

        //string
        String name = "Aleksandrs";
        String surName = "Filipovs";
        String dogName = "Shelby";
        String catName = "Fox";
        String myHobby = "playing computer games";
        String myFavoriteGame = "Mu online";
        String petsName = dogName + " and " + catName;
        String myRace = "Elf";
        String myNick = "Fruttela";


        String fullName = name + " " + surName;
        System.out.println(fullName);

        System.out.printf("\tMy full name is %s. I have a dog and a cat at home.\n" +
                " Their names are %s. My dog is %s years old and my cat is %s years old.\n" +
                " My hobby is %s. My favorite game is %s.\n My favorite character in the game is %s." +
                " My nickname in the game is %s.\n", fullName,petsName,ageOfMyDog,ageOfMyCat,myHobby,myFavoriteGame,myRace,myNick);

        // Play with arithmetic operators (+, -, / .. )

        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));


        // create variables
        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true

        //SortDemo
        int[] arrayOfInts = { 31, 76, 2, 676, 10, 1235,
                3000, 4, 533, 100 };

        for (int i = arrayOfInts.length; --i >= 0; ) {
            for (int j = 0; j < i; j++) {
                if (arrayOfInts[j] > arrayOfInts[j+1]) {
                    int temp = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[j+1];
                    arrayOfInts[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println();

    }
}
