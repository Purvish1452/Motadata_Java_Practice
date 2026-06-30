class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}