package main.java.Session1_control_flow.assignment_problems;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        input.close();
    }
}