// 15. A ride booking application supports different types of rides. Each ride calculates
// fare differently.
// Question:
// Create an abstract class Ride with:
//  distance
//  abstract method calculateFare()
// Create subclasses:
//  BikeRide → fare = ₹5 per km
//  AutoRide → fare = ₹8 per km
//  CarRide → fare = ₹12 per km
// Store different rides in a Ride array and calculate fares using runtime
// polymorphism.
// Abstract base class
abstract class Ride {
    protected double distance;

    // Constructor
    Ride(double distance) {
        this.distance = distance;
    }

    // Abstract method
    abstract double calculateFare();
}

// BikeRide subclass
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

// AutoRide subclass
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8;
    }
}

// CarRide subclass
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Array of Ride references (runtime polymorphism)
        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10); // 10 km
        rides[1] = new AutoRide(10); // 10 km
        rides[2] = new CarRide(10);  // 10 km

        // Calculate and display fares
        for (Ride r : rides) {
            System.out.println("Fare: ₹" + r.calculateFare());
        }
    }
}
