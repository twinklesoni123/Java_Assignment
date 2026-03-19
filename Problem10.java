11. A drawing application is being developed where different shapes can be created.
All shapes share some common properties, so a base class Shape is created with a
method display() to show general shape information.
Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
has its own method to calculate and display its area.
This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
single base class.
// Base class
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

// Circle class
class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
