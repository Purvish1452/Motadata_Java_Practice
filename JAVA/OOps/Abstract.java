abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Stopped");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike Started");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}