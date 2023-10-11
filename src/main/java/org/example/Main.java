package org.example;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Task 1
        System.out.print("Enter a password: ");
        String pass = reader.nextLine();


        while(true) {
            System.out.print("Type the password: ");
            String answer = reader.nextLine();
            if(Objects.equals(pass, answer)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("The secret is: " + pass);

        // Task 2
        int sum = 0;

        System.out.print("Type the first number: ");
        sum += reader.nextInt();
        System.out.print("Type the second number: ");
        sum += reader.nextInt();
        System.out.print("Type the third number: ");
        sum += reader.nextInt();
        System.out.println("Sum: " + sum);

        // Task 3
        int sum2 = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum2 +=  read;
            System.out.println("Sum now: " + sum2);
        }
        System.out.println("Sum in the end: " + sum2);

        // Task 4
        System.out.print("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        }

        // Task 5
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int sumOfNumbers = 0;
        for (int i = 0; i <= number; i++) {
            sumOfNumbers += (int)Math.pow(2, i);
        }

        System.out.println("The result " + sumOfNumbers);

        // Task 6
        System.out.print("How many times do you want to call the function?: ");
        int funcNumOfTimes = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < funcNumOfTimes; i++) {
            printText();
        }

        // Task 7
        printStars(5);
        printStars(3);
        printStars(9);

        // Task 8
        drawStarPyramid(5);
        drawStarPyramid(10);

        drawStarPyramidReversed(10);

        // Task 9
        drawNumbersPyramid(5);
        drawNumbersPyramid2(5);

        // Task 10
        int randomNum = drawNumber();
        int numOfGuesses = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());

            if (guess > randomNum) {
                numOfGuesses++;
                System.out.println("The number is lesser, guesses made: " + numOfGuesses);
            } else if (guess < randomNum) {
                numOfGuesses++;
                System.out.println("The number is greater, guesses made: " + numOfGuesses);
            } else {
                System.out.println("Congratulations, your guess is correct");
                break;
            }
        }

    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawStarPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawStarPyramidReversed(int rows) {
        for (int i = rows; rows >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
            rows--;
        }
        System.out.println();
    }

    public static void drawNumbersPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawNumbersPyramid2(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int drawNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}