// Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for
// payment and order processing.
// Output: &#39;Processing payment...&#39; and &#39;Order confirmed...&#39;
class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Thread for payment processing
        Thread paymentThread = new Thread(() -> {
            try {
                System.out.println("Processing payment...");
                Thread.sleep(1000);  // simulate delay
                System.out.println("Payment processed");
            } catch (InterruptedException e) {
                System.out.println("Payment interrupted");
            }
        });

        // Thread for order processing
        Thread orderThread = new Thread(() -> {
            try {
                System.out.println("Order confirmed...");
            } catch (Exception e) {
                System.out.println("Order processing error");
            }
        });

        // Start both threads
        paymentThread.start();
        orderThread.start();
    }
}
