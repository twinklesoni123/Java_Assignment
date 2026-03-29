// Download Manager
// Create a class DownloadManager. Create multiple threads using
// Runnable interface. Each thread represents file download.
// Output: Downloading messages.
class DownloadManager implements Runnable {

    String fileName;

    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try {
            System.out.println("Downloading " + fileName + "...");
            Thread.sleep(1000); // simulate download time
            System.out.println(fileName + " download complete");
        } catch (InterruptedException e) {
            System.out.println("Download interrupted");
        }
    }

    public static void main(String[] args) {

        // Creating multiple threads
        Thread t1 = new Thread(new DownloadManager("File1"));
        Thread t2 = new Thread(new DownloadManager("File2"));
        Thread t3 = new Thread(new DownloadManager("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
