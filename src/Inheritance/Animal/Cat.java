package Inheritance.Animal;

public class Cat extends Animal{
    private String gender;

    public Cat(String name, int age, boolean isPet, String gender) {
        super(name, age, isPet);
        this.gender = gender;
    }

    @Override
    public String yieldVoice() {
        return "the cat meows";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "gender='" + gender + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

