package shelter;

public class VirtualPet {
    private String KeyPetName;
    private String Description;
    private int Hanger;
    private int Thirst;
    private int Potty;
    private int Boredom;
    private int Tiredness;


    public VirtualPet(String localPetName,
                      String localPetDescription,
                      int Boredom,
                      int Hanger,
                      int Thirst,
                      int Potty,
                      int Bored,
                      int Tiredness) {
        this.KeyPetName = localPetName;
        this.Description = localPetDescription;
        this.Hanger = 6;
        this.Thirst = 6;
        this.Potty = 6;
        this.Boredom = 6;
        this.Tiredness = 6;
    }

    public String getKeyPetName() {
        return this.KeyPetName;
    }

    public String getPetDescription() {
        return this.Description;
    }

    public int getBoredom() {
        return this.Boredom;
    }

    public int getHanger() {
        return this.Hanger;
    }

    public int getThirst() {
        return this.Thirst;
    }

    public int getPotty() {
        return this.Potty;
    }

    public int getTiredness() {
        return this.Tiredness;
    }

    public void playGame() {
        if (Boredom < 5) {
            Boredom -= 5;
        } else Boredom = 0;
    }

    public void feedPet() {
        if (Hanger > 5) {
            Hanger -= 5;
        } else Hanger = 0;
    }

    public void waterToPet() {
        if (Thirst > 5) {
            Thirst -= 5;
        } else Thirst = 0;
    }

    public void takePetOut() {
        if (Potty > 5) {
            Potty -= 5;
        } else Potty = 0;
    }

    public void sleepPets() {
        if (Tiredness > 5) {
            Tiredness -= 5;
        } else Tiredness = 0;
    }

    public void tick() {
        if (Hanger < 10) {
            Hanger += 1;
        }
        if (Thirst < 10) {
            Thirst += 1;
        }
        if (Boredom < 10) {
            Boredom += 1;
        }
        if (Potty < 10) {
            Potty += 1;
        }
        if (Tiredness < 10) {
            Tiredness += 1;
        }
    }
}