//  Create a Stud class to display student information by using a constructor and destructor.
// (Implement a default constructor, multiple constructors, a copy constructor, and an
// overloaded constructor).
class Stud {
    String name;
    int rollNo;

    // 1. Default Constructor
    Stud() {
        this.name = "Unknown";
        this.rollNo = 0;
        System.out.println("Default Constructor Called");
    }

    // 2. Overloaded Constructor (Parameterized)
    Stud(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Multiple Constructors (Another variation)
    Stud(int rollNo) {
        this.name = "Guest Student";
        this.rollNo = rollNo;
        System.out.println("Single Parameter Constructor Called");
    }

    // 4. Copy Constructor (Takes another object of the same class)
    Stud(Stud other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        System.out.println("Copy Constructor Called");
    }

    // Display Method
    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }

    // "Destructor" Simulation (Called when object is destroyed)
    @Override
    protected void finalize() {
        System.out.println("Object is being destroyed (Destructor Simulation)");
    }
}

public class constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Stud s1 = new Stud();
        s1.display();

        // Using Overloaded/Parameterized Constructor
        Stud s2 = new Stud("Alice", 101);
        s2.display();

        // Using Single Parameter Constructor
        Stud s3 = new Stud(102);
        s3.display();

        // Using Copy Constructor (Copies data from s2 to s4)
        Stud s4 = new Stud(s2);
        s4.display();

        // Suggesting Garbage Collection to trigger finalize (destructor)
        s1 = null; 
        System.gc(); 
    }
}