/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CL2~PC20
 */
import java.util.Scanner;
public class cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("MY CAFETERIA");
        System.out.println("[1] Snacks");
        System.out.println("[2] Drinks");
        System.out.print("Enter your choice: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            input.next();
            System.out.print("Enter your choice: ");
        }
        int menu = input.nextInt();

        double taxRate = 0.12;         // VAT = 12%
        double discountRate = 0.10;    // Discount = 10% if subtotal >= 100
        double ageDiscountRate = 0.20; // Senior discount = 20% if age >= 60

        int price = 0;
        String item = "";

        // Menu selection
        if (menu == 1) {
            System.out.println("----------Snacks----------");
            System.out.println("[1] - POTLONG - 25");
            System.out.println("[2] - SIOMAI RICE - 35");
            System.out.println("[3] - CHEESEBURGER - 45");
            System.out.println("[4] FRIES - 30");
            System.out.print("Enter your choice of snacks: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
                System.out.print("Enter your choice of snacks: ");
            }
            int snacks = input.nextInt();

            if (snacks == 1) {
                price = 25;
                item = "POTLONG";
            } else if (snacks == 2) {
                price = 35;
                item = "SIOMAI RICE";
            } else if (snacks == 3) {
                price = 45;
                item = "CHEESEBURGER";
            } else if (snacks == 4) {
                price = 30;
                item = "FRIES";
            } else {
                System.out.println("Invalid choice for snacks!");
                input.close();
                return;
            }

        } else if (menu == 2) {
            System.out.println("----------Drinks----------");
            System.out.println("[1] Soda - 25");
            System.out.println("[2] Coffee - 35");
            System.out.println("[3] Juice - 30");
            System.out.println("[4] Tea - 45");
            System.out.print("Enter your choice of drinks: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
                System.out.print("Enter your choice of drinks: ");
            }
            int drinks = input.nextInt();

            if (drinks == 1) {
                price = 25;
                item = "Soda";
            } else if (drinks == 2) {
                price = 35;
                item = "Coffee";
            } else if (drinks == 3) {
                price = 30;
                item = "Juice";
            } else if (drinks == 4) {
                price = 45;
                item = "Tea";
            } else {
                System.out.println("Invalid choice for drinks!");
                input.close();
                return;
            }

        } else {
            System.out.println("Invalid main choice! Please select 1 or 2.");
            input.close();
            return;
        }

        // Quantity input
        System.out.println("You enter: " + item);
        System.out.print("Enter Quantity: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            input.next();
            System.out.print("Enter Quantity: ");
        }
        int quantity = input.nextInt();

        int subtotal = price * quantity;
        System.out.println("Subtotal: " + subtotal);

        // Discount if subtotal >= 100
        double discount = 0;
        if (subtotal >= 100) {
            discount = subtotal * discountRate;
            System.out.printf("Discount (10%%): -%.2f%n", discount);
        }

        double newSubtotal = subtotal - discount;

        // Ask for age
        System.out.print("Enter your age: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            input.next();
            System.out.print("Enter your age: ");
        }
        int age = input.nextInt();

        double ageDiscount = 0;
        if (age >= 60) {
            ageDiscount = newSubtotal * ageDiscountRate;
            System.out.printf("Senior Discount (20%%): -%.2f%n", ageDiscount);
        }

        double finalSubtotal = newSubtotal - ageDiscount;

        // VAT and Total
        double vat = finalSubtotal * taxRate;
        double total = finalSubtotal + vat;

        System.out.printf("VAT (12%%): %.2f%n", vat);
        System.out.printf("Total: %.2f%n", total);

        // Payment
        double cash;
        do {
            System.out.print("Enter your cash: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
                System.out.print("Enter your cash: ");
            }
            cash = input.nextDouble();

            if (cash < total) {
                System.out.println("Insufficient cash. Please enter more money.");
            }
        } while (cash < total);

        double change = cash - total;
        System.out.printf("Change is: %.2f%n", change);

        input.close();
    }	
    }

