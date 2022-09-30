public class Hogwarts {
    private String name;
    private String house;
    private String trait;
    private double galleon;

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public String getTrait() {
        return trait;
    }

    public double getGalleon() {
        return galleon;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setHouse(String newHouse) {
        house = newHouse;
    }

    public void setTrait(String newTrait) {
        trait = newTrait;
    }

    public void setGalleon(double newGalleon) {
        galleon = newGalleon;
    }

    public Hogwarts(String name) {
        this.name = name;
    }

    public void sortingHat(String trait) {
        if (trait.equals("Bravery")) {
            house = "GRIFFINDOR!";
        } else if (trait.equals("Intelligence")) {
            house = "RAVENCLAW!";
        } else if (trait.equals("Empathy")) {
            house = "HUFFLEPUFF!";
        } else if (trait.equals("Ambition")) {
            house = "SLYTHERIN!";
        } else {
            System.out.println("Think again");
        }
    }

    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("\tHOGWARTS SCHOOL of WITCHCRAFT and WIZARDRY\t\n");
        string.append("Dear ");
        string.append(name);
        string.append("\nWe are plesed to inform you that you have a place at Hogwarts School of Witchcraft and Wizardy.\nPlease find enclosed a list of all necessary books and equipment. \nTerm begins 1 September. We await your owl by no later than 31 July.\n");
        string.append("\nYours sincerely,\nMinerva McGonagall\nDeputy Headmistress\n");
        return string.toString();
    }

    public void letter(String name, String answer) {
        if (answer.equals("Yes"))
            System.out.println(toString());
        else
            System.exit(0);
    }

    public void galleonCheck() {
        System.out.println("Your available balance is " + galleon);
    }

    public void galleonDeposit(double amount) {
        galleon += amount;
    }

    public void purchase(double amount)
    {
        galleon -= amount;
    }

    public boolean expelliarmus(boolean expelliarmus)
    {
        if (expelliarmus == true) {
            System.out.println("\n\t\t\tExpelliarmus\t\t\t\n");
            return true;
        }
        else {
            System.out.println("\n\tBetter luck next time\t\n");
            return false;
        }
    }
    public boolean expectoPatronum(boolean expectoPatronum)
    {
        if (expectoPatronum == true) {
            System.out.println("\n\t\t\tExpecto Patronum\n\t\t\t\n");
            return true;
        }
        else {
            System.out.println("\n\tBetter luck next time\t\n");
            return false;
        }
    }
    public boolean wingardiumLeviosa(boolean wingardiumLeviosa)
    {
        if (wingardiumLeviosa == true) {
            System.out.println("\n\t\t\tWingardium Leviosa\n\t\t\t\n");
            return true;
        }
        else {
            System.out.println("\n\tBetter luck next time\t\n");
            return false;
        }
    }
    public boolean avadaKedavra(boolean avadaKedavra)
    {
        if (avadaKedavra == true) {
            System.out.println("\n\t\t\tAvada Kedavra\n\t\t\t\n");
            return true;
        }
        else {
            System.out.println("\n\tBetter luck next time\t\n");
            return false;
        }
    }
    public boolean lumos(boolean lumos)
    {
        if (lumos == true) {
            System.out.println("\n\t\t\tLumos\n\t\t\t\n");
            return true;
        }
        else {
            System.out.println("\n\tBetter luck next time\t\n");
            return false;
        }
    }
}

