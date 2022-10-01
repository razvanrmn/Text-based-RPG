public class Hogwarts
{
    private String name;
    private String house;
    private String trait;
    private double galleon;

    // Numele o sa fie introdus de la tasatura, sunt 4 Case predefinite, 4 Atribute tot de la tastatura, galleons sunt monedele din H.P deci se refera la bani.

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
    //Get si set, nimic special aici
    public Hogwarts(String name) {
        this.name = name;
    }
    // Constructorul

    public void sortingHat(String trait) {
        if (trait.equals("BRAVERY")) {
            house = "\nGRIFFINDOR!";
        } else if (trait.equals("INTELLIGENCE")) {
            house = "\nRAVENCLAW!";
        } else if (trait.equals("EMPATHY")) {
            house = "\nHUFFLEPUFF!";
        } else if (trait.equals("AMBITION")) {
            house = "\nSLYTHERIN!";
        } else {
            System.out.println("Think again");
        }
    }
    // Am creeat functia sorting hat care te distribuie intr-o anumita clasa in functie de ce trait te defineste

    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("\tHOGWARTS SCHOOL of WITCHCRAFT and WIZARDRY\t\n");
        string.append("Dear ");
        string.append(name);
        string.append("\nWe are plesed to inform you that you have a place at Hogwarts School of Witchcraft and Wizardy.\nPlease find enclosed a list of all necessary books and equipment. \nTerm begins 1 September. We await your owl by no later than 31 July.\n");
        string.append("\nYours sincerely,\nMinerva McGonagall\nDeputy Headmistress\n");
        return string.toString();
    }
    // Am folosit toString ca sa afisez scrisoarea pe care o primesti de la Dumbledore, insotita de numele introdus de tine.
    public void letter(String name, String answer) {
        if (answer.equals("Y"))
            System.out.println(toString());
        else
            System.exit(0);
    }
    // Acest mesaj va aparea dupa ce iti introduci numele, daca vrei sa aplici la Hogwarts aplicatia continua sa ruleze else se opreste.
    public void galleonCheck() {
        System.out.println("Your available balance is " + galleon);
    }
    // Verifica cati bani ai in cont.
    public void galleonDeposit(double amount) {
        galleon += amount;
    }
    // Depunere in cont.
    public void purchase(double amount)
    {
        galleon -= amount;
    }
    // Se foloseste cand doresti sa achizitionezi ceva.
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
    // Aici am facut cate o functie pentru fiecare Spell care o sa aiba o sansa random de succes.
}

