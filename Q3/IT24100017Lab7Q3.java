public class IT24100017Lab7Q3 {
    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.05;
        double totalBillAmount, discountedAmount, amountToPay;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            totalBillAmount = Double.parseDouble(System.console().readLine());

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = Character.toUpperCase(System.console().readLine().charAt(0));

            if (paymentMode == 'C') {
                discountedAmount = totalBillAmount * DISCOUNT_RATE;
                amountToPay = totalBillAmount - discountedAmount;
                System.out.println("Discount is: " + discountedAmount);
            } else if (paymentMode == 'O') {
                amountToPay = totalBillAmount;
                System.out.println("No discount applicable");
            } else {
                System.out.println("Payment Mode is Not Valid");
                continue; // Skip to the next customer
            }

            System.out.println("Amount to be paid: " + amountToPay);
        }
    }
}