In a Calculator class, create multiple methods named add() with different
parameter lists (e.g., one taking two integers, another taking three integers, and a
third taking two doubles).
Call the add() method with various arguments in your main program, demonstrating
that the correct method is selected at compile time based on the arguments provided.
class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different add methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 2.3));
    }
}
