package Composition;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("big", "big","yellow", new Muzzle("pink", "big"));

        System.out.println( dog.getMuzzle().getColor());
        System.out.println( dog.getMuzzle().getSize());


    }
}
