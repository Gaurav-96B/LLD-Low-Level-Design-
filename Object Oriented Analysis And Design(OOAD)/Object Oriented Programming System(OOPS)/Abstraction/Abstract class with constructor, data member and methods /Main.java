// Abstract class
abstract class Shape {
    // Data member
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("Color: " + color);
    }
}

// Concrete subclass
class Circle extends Shape {
    // Additional data member
    double radius;

    // Constructor
    public Circle(String color, double radius) {
        // Call to the constructor of the superclass
        super(color);
        this.radius = radius;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    // Additional data members
    double length;
    double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        // Call to the constructor of the superclass
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Calling methods
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
