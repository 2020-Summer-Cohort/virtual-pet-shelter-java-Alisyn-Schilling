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
        petHunger -= food;
    }

    public void water(int water) {
        petThirst -= water;
    }

    public void play(int play) {
        petBoredom -= play;
    }

    public void tick() {
        petHunger += 5;
        petThirst += 7;
        petBoredom += 2;
    }
}
