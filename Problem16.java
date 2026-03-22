// 17. A company wants to track how many employees have been created in the
// system.
// Question:
// Create a class Employee with attributes name and id.
// Use a static variable employeeCount that increases every time a new object is
// created.
// Write a program that:
//  Creates multiple employee objects
//  Displays the total number of employees using a static method
class Employee {
    String name;
    int id;

    // Static variable to count employees
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment count whenever object is created
    }

    // Static method to display total employees
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating multiple Employee objects
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        // Display total number of employees
        Employee.displayEmployeeCount();
    }
}
