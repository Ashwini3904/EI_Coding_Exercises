package client;

import factory.PaymentFactory;
import java.util.Scanner;
import product.Payment;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to E-Commerce Checkout");
        System.out.print("Enter total amount: $");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Choose Payment Method: creditcard | paypal | upi");
        String type = sc.nextLine().toLowerCase();

        String detail = "";
        switch (type) {
            case "creditcard":
                System.out.print("Enter Credit Card Number: ");
                detail = sc.nextLine();
                break;
            case "paypal":
                System.out.print("Enter PayPal Email: ");
                detail = sc.nextLine();
                break;
            case "upi":
                System.out.print("Enter UPI ID: ");
                detail = sc.nextLine();
                break;
            default:
                System.out.println("Error: Unsupported payment type!");
                sc.close();
                return;
        }

        try {
            Payment payment = PaymentFactory.createPayment(type, amount, detail);
            payment.pay();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
