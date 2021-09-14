/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = inScan.nextInt();
        System.out.print("Enter the second number: ");
        int second = inScan.nextInt();
        System.out.print("Enter the third number: ");
        int third = inScan.nextInt();

        if (first == second && second == third){
            System.exit(0);
        }

        int largest = first;
        if (largest < second){
            largest = second;
        }
        if (largest < third){
            largest = third;
        }

        System.out.printf("The largest number is %d\n", largest);


    }
}