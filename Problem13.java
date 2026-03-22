// 14. Create a base class Person with method role().
// Create subclasses:
//  Employee
//  Manager (extends Employee)
// Override role() in each class and demonstrate multilevel inheritance with runtime
// polymorphism.
// Base class
class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

// Subclass Employee extends Person
class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an employee.");
    }
}

// Subclass Manager extends Employee (multilevel inheritance)
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a manager.");
    }
}

// Main class to demonstrate runtime polymorphism
public class Main {
    public static void main(String[] args) {
        
        // Runtime polymorphism using parent reference
        
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role(); // Calls Person's method
        p2.role(); // Calls Employee's overridden method
        p3.role(); // Calls Manager's overridden method
    }
}
