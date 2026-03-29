// Thread Priority System
// Create a class ThreadPrioritySystem. Create multiple threads
// and assign different priorities and observe execution order.
// Output: Thread execution messages.
class ThreadPrioritySystem {

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 1 running: " + i);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 2 running: " + i);
            }
        });

        // Thread 3
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 3 running: " + i);
            }
        });

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
