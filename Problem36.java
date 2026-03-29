// Music Player Application
// Create a class MusicPlayer. Create thread using Thread class.
// Display song progress using sleep.
// Output: Playing song...
// Progress 1
// Progress 2
// Progress 3.
class MusicPlayer extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");

            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // pause for 1 second
                System.out.println("Progress " + i);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.start();  // start thread
    }
}
