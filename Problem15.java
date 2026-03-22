// 16. A hospital manages different types of staff.
// Question:
// Create a base class Staff with method work().
// Create subclasses:

//  Doctor
//  Nurse
//  Receptionist
// Override work() to display different responsibilities.
// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Doctor subclass
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor treats patients and prescribes medicine.");
    }
}

// Nurse subclass
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse assists doctors and cares for patients.");
    }
}

// Receptionist subclass
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Array of Staff references (runtime polymorphism)
        Staff[] staffMembers = new Staff[3];

        staffMembers[0] = new Doctor();
        staffMembers[1] = new Nurse();
        staffMembers[2] = new Receptionist();

        // Call work() method for each staff
        for (Staff s : staffMembers) {
            s.work();
        }
    }
}
