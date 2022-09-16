package com.company;
import java.text.NumberFormat;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;



public class Main {

    public static void main(String[] args) {

        byte myAge = 30;
        byte herAge = myAge;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        System.out.println(now);
        System.out.println(herAge);
        System.out.println(myAge);
        System.out.println(viewsCount);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        // strings
        String message = new String("hello world" + "!!");

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "fever"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        //escape sequences cups

        String message1 = "hello \"mosh\"";
        String directory = "c:\\windows\\...";
        System.out.println(message1);
        System.out.println(directory);

        // arrays

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] number = {2, 3, 5, 1, 4};
        System.out.println(number.length);
        Arrays.sort(number); // this helps to sort randomized numbers
        System.out.println(Arrays.toString(number));

        //Multi-dimensional Arrays

        double result = Math.random();
        System.out.println(result * 100);


        System.out.println("------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        String Age = scanner.next();
        System.out.println("You are " + Age);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner1.nextLine().trim();
        System.out.println("Your name is: " + name);


        System.out.println("---------------------------------------------------------------------------------------------------------------");

        /**
         * this helps to get percent from the user
         * we get percent in the form of dollars
         */
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(123565321046.891);

        System.out.println(money);

        /**
         * to get percentage instance on your currency
         * using percent instance
         */
        NumberFormat percent = NumberFormat.getPercentInstance();
        String cash = percent.format(0.1);

        System.out.println(cash);

        /**
         * here we want to do chaining method
         * to get the same result in percentage instance in code line 97- 100
         */

        String funds = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(funds);


/**
 * project, creating a morgage calculator using the formulae
 * where the variable will be final such as months percentage and rate
 */


        final byte Months_in_Year = 12;
        final byte Percent = 100;
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / Percent / Months_in_Year;


        System.out.println("Period (Years): ");
        int Years = scanner.nextInt();
        int numberOfPayments = Years * Months_in_Year;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


        System.out.println("==================================================================================================");


        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(y != x);

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;

        System.out.println(isWarm);


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean is_Eligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(is_Eligible);
        System.out.println("======================================================================================================================================");

        int temp = 12;
        if (temp > 30) {
            System.out.println("its a hot day ");
            System.out.println("Drink plenty of water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");

        } else {
            System.out.println("its a cold damn day");
        }
        System.out.println("===================================================================================================================================");


        /**
         * simplifying if statements in java
         *
         */

        int income = 120_000;
        boolean hasAlotOfIncome = income > 100_000;

        if (income > 100_000) {
            hasAlotOfIncome = true;
        }
        System.out.println(income);
        System.out.println("===================================================================================================================================");

        /**
         * the Ternary operator in java
         * TERNARY
         */
        int wage = 100_000;
        String className = income > 100_000 ? "First" : "Economy Class";
        int wages = scanner.nextInt();
        System.out.println(className);


        /**
         * switch statements in java
         *
         */

        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println(" you are an admin ");
                break;
            case " monitor":
                System.out.println(" you are a monitor");
                break;
            default:
                System.out.println(" you are a guest");
        }

        /**
         * if else statements using the divisibility tests of the numbers in question
         * clean code
         * if else statements in java
         */

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Number ");
        int Number = scanner3.nextInt();

        if (Number % 5 == 0 && Number % 3 == 0)
            System.out.println("FizzBuzz");

        else if (Number % 3 == 0)
            System.out.println("Buzz");

        else if (Number % 5 == 0)
            System.out.println("Fizzy");

        else
            System.out.println(Number);

        /**
         * loop in java
         * using for loops
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(" my program " + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Armagedon " + i);
        }

        System.out.println("===================================================================================================================================");


        /**
         * while loops in java
         *
         */

        int p = 0;
        while (p < 5) {
            System.out.println("while loops in java " + p);
            p++;
        }

        Scanner scanner4 = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("inputs: ");
            input = scanner4.next().toLowerCase();
            System.out.println(input);

        }

        /**
         * DO WHILE LOOPS IN JAVA
         */

        do {
            System.out.println("inputs: ");
            input = scanner4.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));


        /**
         * break and continue in java
         *
         */

        String inputs = "";
        while (!inputs.equals("quit")) {
            System.out.println("inputs: ");
            inputs = scanner4.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
                System.out.println(inputs);

        }

        /**
         * for-each loop in java
         *
         */
        String[] fruits = {"Apple", "mango", "orange"};

        for( int i=0; i < fruits.length; i++){
            System.out.println(fruits[i]);

        }
        for (String fruit : fruits){
            System.out.println(fruit);
        }




    }
}
