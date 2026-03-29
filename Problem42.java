// Banking System
// Create a class BankingSystem. Multiple threads access shared
// account balance using synchronized block.
// Output: Balance deduction messages.
class BankingSystem {
    private int balance = 1000;

    // Method to withdraw money safely using synchronized block
    public void withdraw(int amount, String user) {
        synchronized (this) {  // synchronized block to avoid race condition
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(user + " transaction successful. Remaining balance: " + balance);
            } else {
                System.out.println(user + " transaction failed. Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem();

        // Thread 1
        Thread t1 = new Thread(() -> account.withdraw(700, "User1"));

        // Thread 2
        Thread t2 = new Thread(() -> account.withdraw(500, "User2"));

        t1.start();
        t2.start();
    }
}
