package Inheritance.Animal;

public class Dog extends Animal{
    private String color;

    public Dog(String name, int age, boolean isPet, String color) {
        super(name, age, isPet);
        this.color = color;
    }

    @Override
    public String yieldVoice() {
        return "the dog barks";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
