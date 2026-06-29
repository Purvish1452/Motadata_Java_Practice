public class Constuctor{

    String name;

    Constuctor(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Constuctor s = new Constuctor("Rahul");
        System.out.println(s.name);
    }
}