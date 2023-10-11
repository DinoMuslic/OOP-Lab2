package org.example;
import java.util.Objects;
import java.util.Scanner;

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
    }
}