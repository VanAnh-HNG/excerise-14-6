package Encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private  int weigth;

    public Dog(String name, int age, String gender, String race, int weigth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weigth = weigth;
    }

    public Dog(String gender, String race) {
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

        } else
            System.out.println("Check again the age");
    }

    public int getWeigth() {
        return weigth;
    }


    public void setWeigth(int weigth) {
        if (weigth > 0) {
            this.weigth = weigth;
        } else
            System.out.println("Check again the weigth");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
