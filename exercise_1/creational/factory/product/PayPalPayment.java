package product;

public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void pay() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Account: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful via PayPal\n");
    }
}
