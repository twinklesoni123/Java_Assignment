// A company wants to evaluate employee performance.
// Create an abstract class Employee with:
//  attributes: name, id
//  abstract method calculateBonus()
// Create subclasses:

//  Manager → bonus is 20% of salary
//  Developer → bonus is 10% of salary plus project incentive
// Demonstrate runtime polymorphism by storing different employee objects in an
// Employee reference and calling calculateBonus().
// Abstract class
abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

// Manager class
class Manager extends Employee {

    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus: " + bonus);
    }
}

// Developer class
class Developer extends Employee {

    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id, salary);
        this.incentive = incentive;
    }

    void calculateBonus() {
        double bonus = (salary * 0.10) + incentive;
        System.out.println("Developer Bonus: " + bonus);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Manager("Alice", 101, 50000);
        Employee emp2 = new Developer("Bob", 102, 40000, 5000);

        emp1.calculateBonus();
        emp2.calculateBonus();
    }
}
