// Class 1
// Helper class
class Parent {

    // Method of parent class
    void Print() { System.out.println("parent class"); }
}

// Class 2
// Helper class
class Subclass1 extends Parent {

    // Method
    void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class Subclass2 extends Parent {

    // Method
    void Print() { System.out.println("subclass2"); }
}

// Class 4
// Main class
class Test_Overrides {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method
        a = new Subclass1();
        a.Print();

        a = new Subclass2();
        a.Print();

        Subclass1 b3 = new Subclass1();
        b3.Print();

        Subclass2 b4 = new Subclass2();
        b4.Print();
    }
}