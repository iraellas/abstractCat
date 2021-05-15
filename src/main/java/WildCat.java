import javax.sound.midi.Soundbank;
import java.util.Random;

public class WildCat extends Cat {
    private int power = 10;


    public WildCat(String name, String breed) {
        super(name, breed);
    }

    @Override
    void whereLeave() {
        System.out.print(getName() + " is homeless cat. ");
    }

    public int getPower() {
        return power;
    }

    public void hatePeople() {
        int random = (int) (Math.random() * (1 + 1)) + 1;
        if (random == 1) {
            System.out.print(getName() + " started hisses. ");
        } else {
            System.out.print(getName() + " bit on the leg. ");
            power++;
        }
    }

    public void saveWorld() {
        Random rand = new Random();
        int powerEnemy = rand.nextInt(20);
        if (power > 0) {
            System.out.println("And the battle has begun...");
            if (powerEnemy > power) {
                power--;
                System.out.println("The enemy is stronger, that " + getName() + ". Cat lost his power.");
            } else if (powerEnemy < power) {
                power++;
                System.out.println(getName() + " is stronger, that his enemy. Cat received power.");
            }
        } else {
            System.out.println("Cat has no power. He couldn't escape, so enemy kill him.");
            System.exit(0);
        }
    }
}
