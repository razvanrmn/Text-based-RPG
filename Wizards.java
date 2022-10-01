import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Wizards {
    public static void main(String args[]) throws InterruptedException {
        //Prologue
        System.out.println("Welcome to my Text-based RPG");
        System.out.println("Based on the novel Harry Potter J. K. Rowling");
        System.out.println("Press any key to continue....");
        TimeUnit.SECONDS.sleep(1);
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // Chapter I
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        Hogwarts muggle = new Hogwarts(name);
        System.out.println("Would you like to apply to Hogwarts ?\n\t\t\tY/N");
        String answer = sc.next();
        muggle.letter(name, answer.toUpperCase());
        // Chapter II
        FirstYearShoppingList blackWorkRobes = new FirstYearShoppingList(10, 3214);
        FirstYearShoppingList blackPointedHat = new FirstYearShoppingList(10, 47);
        FirstYearShoppingList protectiveGloves = new FirstYearShoppingList(10, 22);
        FirstYearShoppingList winterCloak = new FirstYearShoppingList(10, 66);
        FirstYearShoppingList theStandardBookOfSpells = new FirstYearShoppingList(10, 297);
        FirstYearShoppingList aHistoryOfMagic = new FirstYearShoppingList(10, 158);
        FirstYearShoppingList magicalTheory = new FirstYearShoppingList(10, 99);
        FirstYearShoppingList aBeginnersGuideToTransfiguration = new FirstYearShoppingList(10, 374);
        FirstYearShoppingList oneThousandMagicalHerbsAndFungi = new FirstYearShoppingList(10, 111);
        FirstYearShoppingList magicalDraftsAndPotions = new FirstYearShoppingList(10, 169);
        FirstYearShoppingList fantasticBeastsAndWhereToFindThem = new FirstYearShoppingList(10, 481);
        FirstYearShoppingList theDarkForcesAGuideToSelfProtection = new FirstYearShoppingList(10, 333);
        FirstYearShoppingList wand = new FirstYearShoppingList(10, 666);
        FirstYearShoppingList cauldron = new FirstYearShoppingList(10, 496);
        FirstYearShoppingList crystalPhials = new FirstYearShoppingList(10, 87);
        FirstYearShoppingList telescope = new FirstYearShoppingList(10, 347);
        FirstYearShoppingList brassScales = new FirstYearShoppingList(10, 93);
        muggle.setGalleon(6591);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n\t\tWelcome to Diagon Alley\t\t\n\n");
        int mainMenu = -1;
        int menuA = -1;
        int menuB = -1;
        int menuC = -1;

        while (mainMenu != 0) {
            System.out.println("What would you like to purchase ?\n");
            System.out.println("1. Uniform\n");
            System.out.println("2. Set books\n");
            System.out.println("3. Other equipment\n");
            System.out.println("0. Exit");
            mainMenu = sc.nextInt();
            switch (mainMenu) {
                case 1:
                    while (menuA != 0) {
                        System.out.println("1. Plain work robes");
                        System.out.println("2. Plain pointed hat");
                        System.out.println("3. Protective gloves");
                        System.out.println("4. Winter cloak");
                        System.out.println("0. Exit");
                        menuA = sc.nextInt();
                        switch (menuA) {
                            case 1:
                                System.out.println("How many?");
                                int quantityI = sc.nextInt();
                                if (quantityI > blackWorkRobes.getQuantity()) {
                                    System.out.println("You want more robes than we have on stock");
                                }
                                if (muggle.getGalleon() < blackWorkRobes.getPrice() * quantityI) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    blackWorkRobes.setQuantity(quantityI);
                                    muggle.purchase(blackWorkRobes.getPrice() * blackWorkRobes.getQuantity());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 2:
                                System.out.println("How many?");
                                int quantityII = sc.nextInt();
                                if (quantityII > blackPointedHat.getQuantity()) {
                                    System.out.println("You want more robes than we have on stock");
                                }
                                if (muggle.getGalleon() < blackPointedHat.getPrice() * quantityII) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    blackPointedHat.setQuantity(quantityII);
                                    muggle.purchase(blackPointedHat.getPrice() * blackPointedHat.getQuantity());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 3:
                                System.out.println("How many?");
                                int quantityIII = sc.nextInt();
                                if (quantityIII > protectiveGloves.getQuantity()) {
                                    System.out.println("You want more robes than we have on stock");
                                }
                                if (muggle.getGalleon() < protectiveGloves.getPrice() * quantityIII) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    protectiveGloves.setQuantity(quantityIII);
                                    muggle.purchase(protectiveGloves.getPrice() * protectiveGloves.getQuantity());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 4:
                                System.out.println("How many?");
                                int quantityIV = sc.nextInt();
                                if (quantityIV > winterCloak.getQuantity()) {
                                    System.out.println("You want more robes than we have on stock");
                                }
                                if (muggle.getGalleon() < winterCloak.getPrice() * quantityIV) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    winterCloak.setQuantity(quantityIV);
                                    muggle.purchase(winterCloak.getPrice() * protectiveGloves.getQuantity());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            default: System.out.println("Invalid option");
                        }
                    }
                    break;
                case 2:

                    while (menuB != 0) {
                        System.out.println("1. The Standard Book of Spells (GRADE 1)");
                        System.out.println("2. A History of Magic");
                        System.out.println("3. Magical Theory");
                        System.out.println("4. A Beginner's Guide to Transfiguration");
                        System.out.println("5. One Thousand Magical Herbs and Fungi");
                        System.out.println("6. Magical Drafts and Potions");
                        System.out.println("7. Fantastic Beasts and Where to Find Them");
                        System.out.println("8. The Dark Forces: A Guide to Self-Protection");
                        System.out.println("0. Exit");
                        menuB = sc.nextInt();
                        switch (menuB) {
                            case 1:
                                if (muggle.getGalleon() < theStandardBookOfSpells.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(theStandardBookOfSpells.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 2:
                                if (muggle.getGalleon() < aHistoryOfMagic.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(aHistoryOfMagic.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 3:
                                if (muggle.getGalleon() < magicalTheory.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(magicalTheory.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 4:
                                if (muggle.getGalleon() < aBeginnersGuideToTransfiguration.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(aBeginnersGuideToTransfiguration.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 5:
                                if (muggle.getGalleon() < oneThousandMagicalHerbsAndFungi.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(oneThousandMagicalHerbsAndFungi.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 6:
                                if (muggle.getGalleon() < magicalDraftsAndPotions.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(magicalDraftsAndPotions.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 7:
                                if (muggle.getGalleon() < fantasticBeastsAndWhereToFindThem.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(fantasticBeastsAndWhereToFindThem.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 8:
                                if (muggle.getGalleon() < theDarkForcesAGuideToSelfProtection.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(theDarkForcesAGuideToSelfProtection.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            default: System.out.println("Invalid option");
                        }
                    }
                    break;
                case 3:

                    while (menuC != 0) {
                        System.out.println("1. Wand");
                        System.out.println("2. Cauldron (pewter, standard size 2)");
                        System.out.println("3. Set of glass or crystal phials");
                        System.out.println("4. Telescope");
                        System.out.println("5. Set of brass scales");
                        System.out.println("0. Exit");
                        menuC = sc.nextInt();
                        switch (menuC) {
                            case 1:
                                if (muggle.getGalleon() < wand.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(wand.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 2:
                                if (muggle.getGalleon() < cauldron.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(cauldron.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 3:
                                if (muggle.getGalleon() < crystalPhials.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(crystalPhials.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 4:
                                if (muggle.getGalleon() < telescope.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                }
                                else {
                                    muggle.purchase(telescope.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            case 5:
                                if (muggle.getGalleon() < brassScales.getPrice()) {
                                    System.out.println("Sorry you don't have money for that");
                                    break;
                                }
                                else {
                                    muggle.purchase(brassScales.getPrice());
                                    System.out.println("\nPayment Successful\n");
                                }
                                break;
                            default: System.out.println("Invalid option");
                        }
                    }
                    break;
            }
        }
        // Chapter III
        System.out.println("\nAfter purchasing necessary books and equipment from Diagon Alley ");
        muggle.galleonCheck();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nNow it's time make a deposit, let's go to Gringotts");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nHow many Galleons would you like to deposit?");
        double deposit = sc.nextDouble();
        muggle.galleonDeposit(deposit);
        muggle.galleonCheck();
        // Chapter IV
        System.out.println("\nHead to King's Cross station, Platform 9 3/4 to catch Hogwarts Express");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("......................................................................");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nYou made it to Hogwarts !!");
        TimeUnit.SECONDS.sleep(1);
        // Chapter V
        System.out.println("\nHave a seat at Great Hall, the sorting ceremony will begin soon");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...............................................................");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...............................................................");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("There's nothing hidden in your head");
        System.out.println("The Sorting Hat can't see,");
        System.out.println("So try me on and I will tell you");
        System.out.println("Where you ought to be...");
        System.out.println("...put me on! Don't be afraid");
        System.out.println("And don't get in a flap");
        System.out.println("You are in safe hands (though I have none)");
        System.out.println("For I'm a Thinking Cap!\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Ambition?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Bravery?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Intelligence?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Empathy?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Type what defines you...");
        TimeUnit.SECONDS.sleep(1);
        String trait = sc.next();
        muggle.sortingHat(trait.toUpperCase());
        TimeUnit.SECONDS.sleep(2);
        System.out.println(muggle.getHouse());
        System.out.println();
        System.out.println("\nLet the feast begin\n");
        // Chapter VI
        TimeUnit.SECONDS.sleep(1);
        Random spell = new Random();
        int spellMenu = -1;
        while (spellMenu !=0)
        {
            System.out.println("\nLET'S DO SOME MAGIC, PICK WHAT SPELL DO YOU WANT TO TRY\n");
            System.out.println("1. Expelliarmus\n");
            System.out.println("2. Expecto Patronum\n");
            System.out.println("3. Wingardium Leviosa\n");
            System.out.println("4. Avada Kedavra\n");
            System.out.println("5. Lumos\n");
            System.out.println("0. Exit");
            spellMenu = sc.nextInt();
                switch (spellMenu)
                {
                    case 1:
                        muggle.expelliarmus(spell.nextBoolean());
                        break;
                    case 2:
                        muggle.expectoPatronum(spell.nextBoolean());
                        break;
                    case 3:
                        muggle.wingardiumLeviosa(spell.nextBoolean());
                        break;
                    case 4:
                        muggle.avadaKedavra(spell.nextBoolean());
                        break;
                    case 5:
                        muggle.lumos(spell.nextBoolean());
                        break;
                    default: System.out.println("Invalid option");
                }
        }
        TimeUnit.SECONDS.sleep(1);
        // Chapter VII
        System.out.println("\nGood luck in your first year at HOGWARTS\n");
    }
}
