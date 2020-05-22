package shelter;

public class VirtualPet {
    private String petName;
    private String petDescription;
    private int petHunger;
    private int petThirst;
    private int petBoredom;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHunger = 45;
        this.petThirst = 55;
        this.petBoredom = 65;
    }

    public VirtualPet(String petName, String petDescription, int petHunger, int petThirst, int petBoredom) {

        this.petName = petName;
        this.petDescription = petDescription;
        this.petHunger = petHunger;
        this.petThirst = petThirst;
        this.petBoredom = petBoredom;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetBoredom() {
        return petBoredom;
    }

    public void feed(int food) {
        if ((petHunger - food) > 0) {
            petHunger -= food;
        } else {
            petHunger = 0;
        }

    }

    public void water(int water) {
        if ((petThirst - water) > 0) {
            petThirst -= water;
        } else {
            petThirst = 0;
        }
    }

    public void play(int play) {
        if ((petBoredom - play) > 0) {
            petBoredom -= play;
        } else {
            petBoredom = 0;
        }
    }

    public void tick() {
        petHunger += 9;
        petThirst += 11;
        petBoredom += 7;
        if (petHunger > 100) {
            petHunger = 100;
        }
        if (petThirst > 100) {
            petThirst = 100;
        }
        if (petBoredom > 100) {
            petBoredom = 100;
        }
    }
}
