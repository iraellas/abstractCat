import java.util.Scanner;

public class Master {
    private int money = 0;
    private String name;
    private boolean isMoodToScoldCat = false;

    public void decreaseAmountOfMoney() {
        if (money > 0) {
            money--;
            System.out.println(name + " paid the 1$. He has " + money + " $ left. ");
            isMoodToScoldCat = false;
        } else {
            System.out.println("Master of cat don't have enough money, so he went to work and received 3$.");
            isMoodToScoldCat = true;
            money += 3;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMoodToScoldCat() {
        return isMoodToScoldCat;
    }

    public String getName() {
        return name;
    }

}
