// 20. A company wants to clearly assign constructor parameters to object variables.

// Question:
// Create a class Employee with variables name and salary.
// Use this keyword inside the constructor to initialize object variables.
// Display employee details.
class Employee {
    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name;       // assigns parameter to instance variable
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class Company {
    public static void main(String[] args) {

        // Creating Employee objects
        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Sneha", 60000);

        // Displaying details
        e1.display();
        e2.display();
    }
}
