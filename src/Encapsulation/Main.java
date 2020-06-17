package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Dog", 1,"male", "bulldog",2);
        Dog dog2 = new Dog( "male", "bulldog");

        dog.getAge();
        dog.setAge(-3);

        System.out.println(dog);

        System.out.println("/////////////////////");

        Pocket pocket = new Pocket (200);

        pocket.setMoney(-3001);

        System.out.println(pocket);


    }

}
