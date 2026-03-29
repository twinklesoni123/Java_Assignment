// Chat Application
// Create a class ChatApplication. Create threads for sending and
// receiving messages. Demonstrate thread lifecycle.
// Output: Sending and receiving messages.
class ChatApplication {

    public static void main(String[] args) {

        // Thread for sending messages
        Thread sender = new Thread(() -> {
            System.out.println("Sender thread state: " + Thread.currentThread().getState());
            for (int i = 1; i <= 3; i++) {
                System.out.println("Sending message " + i);
                try {
                    Thread.sleep(1000); // simulate delay
                } catch (InterruptedException e) {
                    System.out.println("Sender interrupted");
                }
            }
            System.out.println("Sender thread finished");
        });

        // Thread for receiving messages
        Thread receiver = new Thread(() -> {
            System.out.println("Receiver thread state: " + Thread.currentThread().getState());
            for (int i = 1; i <= 3; i++) {
                System.out.println("Receiving message " + i);
                try {
                    Thread.sleep(1200); // simulate delay
                } catch (InterruptedException e) {
                    System.out.println("Receiver interrupted");
                }
            }
            System.out.println("Receiver thread finished");
        });

        // Start both threads
        sender.start();
        receiver.start();

        // Main thread state
        System.out.println("Main thread state: " + Thread.currentThread().getState());
    }
}
