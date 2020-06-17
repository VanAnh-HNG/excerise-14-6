package Inheritance.Animal;

public class Animal {
    private String name;
    private int age;
    private boolean isPet;

    public Animal(String name, int age, boolean isPet) {
        this.name = name;
        this.age = age;
        this.isPet = isPet;
    }


    public String yieldVoice() {
        return "the animal yields the voice";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isPet=" + isPet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

}
