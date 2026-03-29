// Railway Reservation System

// Create a class RailwayReservation. Use synchronization to
// avoid double booking.
// Output: &#39;Ticket booked successfully&#39; or &#39;No tickets available&#39;
class RailwayReservation {

    int availableSeats = 1;

    // synchronized method to avoid double booking
    synchronized void bookTicket(String name) {
        if (availableSeats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            availableSeats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }

    public static void main(String[] args) {

        RailwayReservation obj = new RailwayReservation();

        // Creating threads
        Thread t1 = new Thread(() -> obj.bookTicket("User1"));
        Thread t2 = new Thread(() -> obj.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}
