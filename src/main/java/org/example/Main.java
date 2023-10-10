package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner reader = new Scanner(System.in);
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

        //Task 2
        int sum = 0;

        System.out.print("Type the first number: ");
        sum += reader.nextInt();
        System.out.print("Type the second number: ");
        sum += reader.nextInt();
        System.out.print("Type the third number: ");
        sum += reader.nextInt();
        System.out.println("Sum: " + sum);
    }
}