package Encapsulation;

public class Pocket {
    private int Money;

    public Pocket(int money) {
        Money = money;
    }

    public int getMoney() {
        if (Money>= 10) {
            return Money;
        } return 0;
    }

    public void setMoney(int money) {
        if ( money > 0 && money <3000) {
            Money = money;
        } else
            System.out.println("I don’t have enough space in my pocket for as much money!");
    }

    @Override
    public String toString() {
        return "Pocket{" +
                "Money=" + Money +
                '}';
    }
}
