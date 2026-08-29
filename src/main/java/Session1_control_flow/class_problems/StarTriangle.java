package main.java.Session1_control_flow.class_problems;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("The right-angled triangle pattern for " + rows + " rows is");

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        input.close();
    }
}