import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Puss", "rust");
        Animal duck = new Duck("Donald", "white");
        Animal dog = new Dog("Cosmo", "white");
        Animal falcon = new Falcon("Sam", "black");
        Animal crocodile = new Crocodile("Gena", "green");
        Animal shark = new Shark("Jose", "white");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(duck);
        animals.add(dog);
        animals.add(falcon);
        animals.add(crocodile);
        animals.add(shark);

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();

    }
}