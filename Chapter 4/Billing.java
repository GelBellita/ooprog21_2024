public class Billing {

    // overload 1
    public void computeBill(double price) {
        double tax = 0.08 * price;
      double total = price + tax;
      System.out.println("The total price for the bill is: $" + total);    }

    // overload 2
    public void computeBill(double price, int quantity) {
        double total = price * quantity * 1.08; 
        System.out.println("The total price for the bill is: $" + total);
    }

    // overload 3
    public void computeBill(double price, int quantity, int couponDiscount) {
      double subtotal = price * quantity;
        double discountAmount = (couponDiscount / 100.0) * subtotal;
        double total = (subtotal - discountAmount) * 1.08; 
        System.out.println("The total price for the bill is: $" + total);    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        
        // method calling
        billing.computeBill(23.2); //given example
        billing.computeBill(23.2, 6); 
        billing.computeBill(23.2, 5, 15);
    }
}
