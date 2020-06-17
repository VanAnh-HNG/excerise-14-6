package Inheritance.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("C", 2, true, "female");
        Dog dog = new Dog("D", 1, true, "black");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        System.out.println(animals);

        for (Animal animal : animals) {
            System.out.println( animal.yieldVoice());
        }
    }
}
