// Producer Consumer System

// Create a class Restaurant. Chef prepares food and waiter serves
// it using wait() and notify().
// Output: &#39;Chef prepared food&#39; and &#39;Waiter served food&#39;
class Restaurant {
    private boolean foodAvailable = false;

    // Chef (Producer)
    public synchronized void prepareFood() {
        try {
            while (foodAvailable) {
                wait(); // wait if food is not served yet
            }
            System.out.println("Chef prepared food");
            foodAvailable = true;
            notify(); // notify waiter
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }
    }

    // Waiter (Consumer)
    public synchronized void serveFood() {
        try {
            while (!foodAvailable) {
                wait(); // wait if food not prepared yet
            }
            System.out.println("Waiter served food");
            foodAvailable = false;
            notify(); // notify chef
        } catch (InterruptedException e) {
            System.out.println("Waiter interrupted");
        }
    }

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        // Chef thread
        Thread chef = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                restaurant.prepareFood();
            }
        });

        // Waiter thread
        Thread waiter = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                restaurant.serveFood();
            }
        });

        chef.start();
        waiter.start();
    }
}
