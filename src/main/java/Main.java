import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomeCat homeCat = new HomeCat("Naruto", "Jinchuriki");
        WildCat wildCat = new WildCat("Sasuke", "Uchiha");
        homeCat.master.setName("Hiruzen");

        wildCat.whereLeave();
        System.out.print("He and " + homeCat.getName() + " are friends.");
        homeCat.whereLeave();
        System.out.println("He is very naughty and lazy, but " + wildCat.getName() + " never had such characteristics. Maybe that is why he is always alone?");
        System.out.println("You have the opportunity to read a mini-story and test your luck: will " + wildCat.getName() + " go to Orochimaru or not?");

        homeCat.layOnSofa();
        System.out.println(wildCat.getName() + " decided to go outside and saw a dog gnawing at a statuette that Naruto often plays with. Then he realized that he had to do something. ");
        wildCat.saveWorld();
        System.out.println(wildCat.getName() + " returned to the house and saw that Naruto...");
        System.out.println("Choose the action: 1. lay on sofa; 2. spoil shoes");
        switch (scanner.nextInt()) {
            case 1:
                homeCat.layOnSofa();
                break;
            case 2:
                homeCat.spoilShoes();
                break;
        }

        System.out.println("Sasuke walked by indifferently. The door opened by a man and he entered. He introduced himself as Orochimaru. He tried to pet cat but ");
        wildCat.hatePeople();
        System.out.print("Orochimaru asked \"What a funny cat, what's his name?\" \nHiruzen replied, \"I call him " + wildCat.getName() + "\". I just let Naruto play with him.\n");
        wildCat.whereLeave();
        System.out.println("Orochimaru sit down opposite " + wildCat.getBreed() + ": \"Then can I pick it up? Well, will you come with me?\" Sasuke looked at Naruto.");
        if (homeCat.getMood() == wildCat.getPower() || homeCat.getMood() > wildCat.getPower()) {
            System.out.println("Naruto softly say \"meow\". Sasuke decided to stay with Naruto.");
        } else {
            System.out.println("Naruto softly say \"meow\". Sasuke decided to leave with Orochimaru");
        }


    }

}
