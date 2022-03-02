package com.teksystem;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
// EXERCISES VARIABLES
    public static void v1AddInt(){
        int x = 1;
        int y = 2;
        System.out.println(x+y);
    }
    public static void v2AddDouble(){
        double x = 1;
        double y = 2;
        double z = x+y;
        System.out.println(z);
    }
    public static void v3AddDoubleInt(){
        int x = 1;
        double y = 2.5;
        double z = x + y;
        System.out.println(z);
    }
    public static void v4DivideInt(){
        int x = 12;
        int y = 7;
        int z = x / y;
        System.out.println(z);
        double x2 = 12.0;
        System.out.println(x2/y);
    }
    public static void v5DivideDoubleCastInt(){
        double x = 12.4;
        double y = 4.0;
        double z = x / y;
        System.out.println((int) z);
    }
    public static void v6CastDouble(){
        int x = 5;
        int y = 6;
        int q = x / y;
        System.out.println(q);
        double q2 = x / ((double) y);
        System.out.println(q2);
    }
    public static void v7ConstantDec(){
        /*
        Final means that the value cannot be changed after initialization,
        that's what makes it a constant. static means that instead of having
        space allocated for the field in each object, only one instance is
        created for the class.

        So, static final means only one instance of the variable no matter how
        many objects are created and the value of that variable can never change.
        "public static final int A = 0;"
         */
        final int A = 0;
        System.out.println(A+5);
    }
    public static void v8Cafe(){
        double coffeePrice = 1.45;
        double cappuccinoPrice = 2.25;
        double espressoPrice = 2.85;
        double greenteaPrice = 1.65;
        double subtotal;
        double totalSale;
        final double SALES_TAX = 1.07;
        subtotal = (3 * coffeePrice) + (4 * cappuccinoPrice) + (2 * espressoPrice)
                + (greenteaPrice);
        totalSale = subtotal * SALES_TAX;
        System.out.printf("The total comes to %.2f, including tax\n", totalSale);
    }
//EXERCISES VARIABLE


//EXERCISES OPERATORS AND NUMBERS
    public static void v1BinaryNotation(){
        // 1/2/4/8/16/32/64/128/256/512/1024/2048/4096/8192/16384/32768
        // Convert the following to their binary representations
        System.out.printf("1: 0001, %s\n", Integer.toBinaryString(1));
        System.out.printf("8: 1000, %s\n", Integer.toBinaryString(8));
        System.out.printf("33: 0010 0001, %s\n", Integer.toBinaryString(33));
        System.out.printf("78: 0100 1110, %s\n", Integer.toBinaryString(78));
        System.out.printf("787: 0011 0001 0011, %s\n", Integer.toBinaryString(787));
        System.out.printf("33,987: 1000 0100 1100 0011, %s\n", Integer.toBinaryString(33987));
        }
    public static void v2Binary2Decimal(){
        System.out.printf("0010: 2, %d\n", Integer.parseInt("0010",2));
        System.out.printf("1001: 9, %d\n", Integer.parseInt("1001", 2));
        System.out.printf("00110100: 52, %d\n", Integer.parseInt("00110100", 2));
        System.out.printf("01110010: 114, %d\n", Integer.parseInt("01110010", 2));
        System.out.printf("001000011111: 543, %d\n", Integer.parseInt("001000011111", 2));
        System.out.printf("0010110001100111: 11367, %d\n", Integer.parseInt("0010110001100111", 2));
    }
    public static void v3LeftShift(){
        int x = 2;
        int y = 9;
        int z = 17;
        int w = 88;
        String xx = Integer.toBinaryString(x); // 0010
        String xxS = Integer.toBinaryString(x << 1); // 0100 (4)
        String yy = Integer.toBinaryString(y); // 1001
        String yyS = Integer.toBinaryString(y << 1); // 0001 0010 (18)
        String zz = Integer.toBinaryString(z); // 0001 0001
        String zzS = Integer.toBinaryString(z << 1); // 0010 0010 (34)
        String ww = Integer.toBinaryString(w); // 0101 1000
        String wwS = Integer.toBinaryString(w << 1); // 1011 0000 (176)
        System.out.printf("xnormal: %s xshift: %s\nynormal: %s yshift: %s\nznormal: %s zshift %s\nwnormal: %s wshift: %s",
                            xx, xxS, yy, yyS, zz, zzS, ww, wwS);
    }
    public static void v4RightShift(){
        int x = 150;
        long y = 225;
        long z = 1555;
        int w = 32456;
        String xx = Integer.toBinaryString(x); // 0010
        String xxS = Integer.toBinaryString(x << 1); // 0100 (4)
        String yy = Long.toBinaryString(y); // 1001
        String yyS = Long.toBinaryString(y << 1); // 0001 0010 (18)
        String zz = Long.toBinaryString(z); // 0001 0001
        String zzS = Long.toBinaryString(z << 1); // 0010 0010 (34)
        String ww = Integer.toBinaryString(w); // 0101 1000
        String wwS = Integer.toBinaryString(w << 1); // 1011 0000 (176)
        System.out.printf("xnormal: %s xshift: %s\nynormal: %s yshift: %s\nznormal: %s zshift %s\nwnormal: %s wshift: %s",
                xx, xxS, yy, yyS, zz, zzS, ww, wwS);
    }
    public static void v5Bitwise(){
        int x = 7; //  0000 0111
        int y = 17; // 0001 0001
        int z = x&y;// 0000 0001 (1)
        int z1 = x | y; //0001 0111
    }
    public static void v6PostFix(){
        int x = 8;
        x++;
        System.out.println(x);
    }
    public static void v7LoopIncrement(){ //DO NOT RUN
        int x = 0;
        while(x>0){
            x++;
        }
        do {
            x++;
        } while (x>0);
        for (int i = 0; i < x; i++) {
            x++;
        }
    }
    public static void v8PostPreFix(){
        int x = 5;
        int y = 8;
        int z = (++x) + y; //Increment x first then calculate sum
        System.out.println(z);
        z= (x++) + y;
        System.out.println(z);
    }


//EXERCISES OPERATORS AND NUMBERS


//EXERCISES CONTROL FLOW(CONDITIONAL)
public static void v1IfStatement(){
    int x = 7;
    for (int i = 0; i < 2 ; i++) {
        if (x < 10){
            System.out.printf("x: %d is less than 10", x);
            x = 15;
        }
        System.out.println(x);
    }

}
    public static void v2IfStatement(){
        int x = 7;
        for (int i = 0; i < 2; i++) {
            if (x < 10){
                System.out.printf("x: %d is less than 10", x);
                x = 15;
            }
            else if (x > 10){
                System.out.printf("x: %d is greater than 10", x);
            }
        }
    }
    public static void v3IfAnd(){
        int x = 5;
        for (int i = 0; i < 3; i++) {
            if (x < 10){
                System.out.printf("x: %d is less than 10", x);
                x = 15;
            }
            else if ((x > 10) && (x < 20)){
                System.out.printf("x: %d is Between 10 and 20", x);
                x = 22;
            }
            else if (x >= 20){
                System.out.printf("x: %d is greater than or equal to 20");
            }
        }
    }
    public static void v4IfOutRange(){
        int x = 15;
        for (int i = 0; i < 2; i++) {
            if ((x < 10) || (x > 20)){
                System.out.printf("x: %d is Out of Range", x);
            }
            else{
                System.out.printf("x: %d is In Range", x);
                x = 5;
            }
        }
    }
    public static void v5IfCases(){
        Scanner input = new Scanner(System.in);
        String userResponse = "yes";
        String letterGrade = null;
        boolean cont;
        do{
            do {
                cont = false;
                System.out.print("Please Enter your Grade: ");
                int userInput = input.nextInt();
                if ((userInput >= 90) && (userInput < 100))
                    letterGrade = "A";
                else if ((userInput >= 80) && (userInput < 90))
                    letterGrade = "B";
                else if ((userInput >= 70) && (userInput < 80))
                    letterGrade = "C";
                else if ((userInput >= 60) && (userInput < 70))
                    letterGrade = "D";
                else if ((userInput <= 60) && (userInput >= 0))
                    letterGrade = "F";
                else {
                    System.out.println("Invalid Submission, try again");
                    userInput = input.nextInt();
                    cont = true;
                }
            }while (cont);
            System.out.println();
            System.out.printf("Your Letter Grade is: %s\n",letterGrade);
            System.out.print("Continue?: ");
            userResponse = input.next();
        }while (userResponse.equals("yes"));
    }
    public static void v6Switch(){
        enum Days{
            Mon, Tue, Wed, Thu, Fri, Sat, Sun
        }
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter either a number or abr for weekday: ");
        //Take all input as a string
        if (input.hasNextInt()){
            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Case: Monday");
                    break;
                case 2:
                    System.out.println("Case: Tuesday");
                    break;
                case 3:
                    System.out.println("Case: Wednesday");
                    break;
                case 4:
                    System.out.println("Case: Thursday");
                    break;
                case 5:
                    System.out.println("Case: Friday");
                    break;
                case 6:
                    System.out.println("Case: Saturday");
                    break;
                case 7:
                    System.out.println("Case: Sunday");
                    break;
            }
        }
        else if(input.hasNextLine()){
            String userInput = input.nextLine();
            //Changes first letter to cAp to satisfy enum
            userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
            try{
                Days userDay = Days.valueOf(userInput);
                switch (userDay){
                    case Mon:
                        System.out.println("Case: Monday");
                        break;
                    case Tue:
                        System.out.println("Case: Tuesday");
                        break;
                    case Wed:
                        System.out.println("Case: Wednesday");
                        break;
                    case Thu:
                        System.out.println("Case: Thursday");
                        break;
                    case Fri:
                        System.out.println("Case: Friday");
                        break;
                    case Sat:
                        System.out.println("Case: Saturday");
                        break;
                    case Sun:
                        System.out.println("Case: Sunday");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Inside CATCH");
                e.printStackTrace();
            }
        }
    }
    //EXERCISES CONTROL FLOW(CONDITIONAL)

    //EXERCISES LOOPS
    public static void v1Forloop(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void v2WhileLoop10Incr(){
        for (int i = 0; i <= 100; i+=10) {
            System.out.println(i);
        }
        int i = 0;
        while(i <= 100){
            i+=10;
            System.out.println(i);
        }
    }
    public static void v3WhileLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);
    }
    public static void v4ForLoop5Multi(){
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if ((i >= 25) && (i <= 75)) {
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
    public static void v5NotGreater50(){
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i > 50) {
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
    public static void v6NestedForLoop(){
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Week %d:\n", i);
            for (int j = 1; j <= 5 ; j++) {
                System.out.printf("Day %d\n", j);
            }
        }
    }
    public static void v7Palindromes(){
        String forward;
        String backward;
        for (int i = 10; i <= 200; i++) {
            int index = String.valueOf(i).length(); // Convert to String and get Length
            forward = String.valueOf(i);            // Convert to String
            backward = "";                          // Sets back to empty after each loop
            char adder = forward.charAt(index-1);   // Subtract 1 to get inside string array
            backward += adder;                      // Building backwards with adder = forward in reverse
            for (int j = 1; j <= index-1; j++) {    // Loops through length of number via string length
                adder = forward.charAt((index-1) - j);
                backward += adder;
            }
            if (forward.equals(backward)){
                System.out.printf("The Palindrome: %s, exists\n", forward);
            }
        }
    }
    public static void v8Fibonacci(){
        // Output is the sum of the two preceding numbers
        int fibCur = 0;
        int fibPre1 = 0;
        int fibPre2 = 0;
        int iterator = 0;
        while(fibCur <= 50){
            if (fibPre1 != 0) {
                fibCur = fibPre1 + fibPre2;
            }
            System.out.printf("Fibonacci at iteration %d is: %d\n", iterator, fibCur);
            iterator++;         // Below simulates moving through the fib sequence by passing back values
            fibPre2 = fibPre1;  // Setting fibPre2 to fibPre1 to pass down value
            fibPre1 = fibCur;   // Setting fibPre1 to fibPre to pass down value
            fibCur++;
        }

    }
    public static void v9NestedFor(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Inner loop: j = %d   Outer loop: i: %d\n", j, i);
            }
        }
    }
    //EXERCISES LOOPS


    //EXERCISES ARRAYS
    public static void v1ArrInt(){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // arr[3] = 4; This will cause out of bounds error cuz we declare 3 slots not indexes
        for (int num: arr) {
            System.out.println(num);
        }
    }
    public static void v2MidArr(){
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println(arr[arr.length/2]);
    }
    public static void v3ArrStr(){
        String[] arr = {"Red", "Green", "Blue", "Yellow"};
        System.out.println(arr.length);
        String[] copiedArr = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(copiedArr));
    }
    public static void v4OutBoundArr(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int firstInd = arr[0];
        int lastInd = arr[arr.length-1];
        System.out.printf("The first Index is: %d   The last Index is: %d", firstInd, lastInd);
        // System.out.printf("Sum dum Exception %d", arr[arr.length]);
        // arr[5] = 7; Error too
    }
    public static void v5ArrLoop(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.printf("Array Index: %d  with number: %d\n", i, arr[i]);
        }
    }
    public static void v6ArrLoopMulti(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*2;
            System.out.printf("Array Index: %d  with number: %d\n", i, arr[i]);
        }
    }
    public static void v7ArrExcep(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if(i != (arr.length/2))
            System.out.printf("Array Index: %d  with number: %d\n", i, arr[i]);
        }
    }
    public static void v8ArrSwap(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int temp = arr[0];
        arr[0] = arr[arr.length/2];
        arr[arr.length/2] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array Index: %d  with number: %d\n", i, arr[i]);

        }
    }
    public static void v9SortArr(){
        //Sort in ascending order then print smallest and largest element
        int[] arr = {4, 2, 9, 13, 1, 0};
        int temp;
        int looker;
        for (int startIndex = 0; startIndex < arr.length; startIndex++) {
            looker = startIndex + 1;
            while( looker < arr.length) {
                if (arr[startIndex] > arr[looker]){
                    temp = arr[startIndex];
                    arr[startIndex] = arr[looker];
                    arr[looker]= temp;
                }
                looker++;
            }
            System.out.printf("The array index: %d  array number: %d\n", startIndex, arr[startIndex]);
            looker++;
        }
        System.out.printf("The smallest number is: %d\n", arr[0]);
        System.out.printf("The largest number is: %d\n", arr[arr.length-1]);
    }
    public static void v10DataTypeArr(){
        Object[] objects = new Object[5];
        objects[0] = 1;
        objects[1] = "String1";
        objects[2] = "String2";
        objects[3] = "String3";
        objects[4] = 1.25;
        for (Object o: objects
             ) {
            System.out.println(o);
        }
    }
    //EXERCISES ARRAYS


    public static void main(String[] args) {
	// write your code here
        //EXERCISES VARIABLE
        v1AddInt();
        v2AddDouble();
        v3AddDoubleInt();
        v4DivideInt();
        v5DivideDoubleCastInt();
        v6CastDouble();
        v7ConstantDec();
        v8Cafe();
//        //EXERCISES OPERATORS AND NUMBERS
        v1BinaryNotation();
        v2Binary2Decimal();
        v3LeftShift();
        v4RightShift();
        v5Bitwise();
        v6PostFix();
        v8PostPreFix();
//        //EXERCISES CONTROL FLOW(CONDITIONAL)
        v1IfStatement();
        v2IfStatement();
        v3IfAnd();
        v4IfOutRange();
        v5IfCases();
        v6Switch();
        //EXERCISES LOOPS
        v1Forloop();
        v2WhileLoop10Incr();
        v3WhileLoop();
        v4ForLoop5Multi();
        v5NotGreater50();
        v6NestedForLoop();
        v7Palindromes();
        v8Fibonacci();
        v9NestedFor();
        //EXERCISES ARRAYS
        v1ArrInt();
        v2MidArr();
        v3ArrStr();
        v4OutBoundArr();
        v5ArrLoop();
        v6ArrLoopMulti();
        v7ArrExcep();
        v8ArrSwap();
        v9SortArr();
        v10DataTypeArr();
    } //Main
} //CLASS
