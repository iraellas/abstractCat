public class HomeCat extends Cat {
    Master master = new Master();

    private int mood = 10;

    public HomeCat(String name, String breed) {
        super(name, breed);
    }

    @Override
    void whereLeave() {
        System.out.print(getName() + " is Konohas cat. ");
    }

    public void layOnSofa() {
        int random = (int) (Math.random() * (1 + 1)) + 1;
        if (random == 1) {
            System.out.print(getName() + " lying on sofa. ");
        } else {
            System.out.print(getName() + " sleep on sofa. ");
            mood++;
        }
      ;
    }

    public int getMood() {
        return mood;
    }

    public void spoilShoes() {
        System.out.println(getName() + " spoiled shoes.");
        master.decreaseAmountOfMoney();
        if (master.isMoodToScoldCat()) {
            mood--;
        } else mood++;

    }
}
