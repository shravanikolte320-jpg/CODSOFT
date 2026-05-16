package com.game;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.50;
        double inrToUsd = 0.012;

        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");

        System.out.print("Choose conversion: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double converted;

        if (choice == 1) {

            converted = amount * usdToInr;

            System.out.println("Converted Amount: ₹" + converted);
        }

        else if (choice == 2) {

            converted = amount * inrToUsd;

            System.out.println("Converted Amount: $" + converted);
        }

        else {
            System.out.println("Invalid Choice");
        }
    }
}