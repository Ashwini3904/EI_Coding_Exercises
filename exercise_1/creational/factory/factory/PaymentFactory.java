package factory;

import product.*;


public class PaymentFactory {
    public static Payment createPayment(String type, double amount, String detail) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(amount, detail);
            case "paypal":
                return new PayPalPayment(amount, detail);
            case "upi":
                return new UpiPayment(amount, detail);
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
