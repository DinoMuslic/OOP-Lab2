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
                System.out.println("Righ!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }


    }
}