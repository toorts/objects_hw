public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void swim() {}

    @Override
    public void fly() {}

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
        System.out.println("Cat woke up..");
    }

    private void findFood() {
        System.out.println("Cat found food..");
    }

    private void eat() {
        System.out.println("Cat eat..");
    }

    public void toPlay() {
        System.out.println("Cat played..");
    }

    public void goToSleep() {
        System.out.println("Cat already asleep..");
    }
}