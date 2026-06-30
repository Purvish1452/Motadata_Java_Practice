class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}