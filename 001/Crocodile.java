public class Crocodile extends Animal {
    public Crocodile(String name, String color) {
        super(name, color, 4);
    }

    public Crocodile(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Cranck!");
    }

    @Override
    public void fly() {}
}
