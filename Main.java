// Develop a java program that defines an abstract class called Shape, which includes two
// integer variables and an empty method named printArea().Create three
// subclasses:Rectangle, Triangle, and Circle, each extending the Shape class. In each
// subclass,implement the printArea() method to calculate and display the area of the
// respective Shape .
// Step 1 - Create Abstract Class
abstract class Shape {
    int a;
    int b;

    abstract void printArea(); // empty method
}

// Step 2 - Rectangle Class
class Rectangle extends Shape {
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle : " + (a * b));
    }
}

// Step 3 - Triangle Class
class Triangle extends Shape {
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printArea() {
        System.out.println("Area of Triangle  : " + (a * b) / 2);
    }
}

// Step 4 - Circle Class
class Circle extends Shape {
    Circle(int a, int b) {
        this.a = a; // radius
    }

    void printArea() {
        System.out.println("Area of Circle    : " + (3.14 * a * a));
    }
}

// Step 5 - Main Class
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        r.printArea();

        Triangle t = new Triangle(10, 5);
        t.printArea();

        Circle c = new Circle(7, 0);
        c.printArea();
    }
}