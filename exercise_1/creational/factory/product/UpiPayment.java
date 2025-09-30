package product;

public class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful via UPI\n");
    }
}
