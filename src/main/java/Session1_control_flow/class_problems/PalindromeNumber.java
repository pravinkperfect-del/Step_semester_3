package main.java.Session1_control_flow.class_problems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int origNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        boolean isPalindrome = reversedNumber == origNumber;

        System.out.println("Is the number " + origNumber +
                " a Palindrome? " + isPalindrome);

        input.close();
    }
}