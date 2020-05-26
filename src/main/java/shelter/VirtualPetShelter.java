package shelter;

import java.util.*;

public class VirtualPetShelter {
    Map<String, VirtualPet> hashMapOfPets = new HashMap<>();
    Collection<VirtualPet> listOfAllPets = new ArrayList<>();

    public void addPet(VirtualPet pet) {
        hashMapOfPets.put(pet.getKeyPetName(), pet);
    }

    public VirtualPet findPetByKey(String keyPetName) {
        return hashMapOfPets.get(keyPetName);
    }

    public Collection<VirtualPet> getListOfAllPets() {
        return hashMapOfPets.values();
    }

    public void removePet(VirtualPet pet) {
        hashMapOfPets.remove(pet.getKeyPetName(), pet);
    }

    public void playWithPet(String keyPetName) {
        VirtualPet enteredPet = findPetByKey(keyPetName);
        enteredPet.playGame();
    }

    public void feedAllPets() {
        for (VirtualPet pet : listOfAllPets) {
            pet.feedPet();
        }
    }

    public void waterToAllPets() {
        for (VirtualPet pet : listOfAllPets) {
            pet.waterToPet();
        }
    }

    public void tickAllPets() {
        for (VirtualPet pet : listOfAllPets) {
            pet.tick();
        }
    }

    public static boolean gameOn() {
        return true;
    }

    public void takeAllPetsOut() {
        for (VirtualPet pet : listOfAllPets) {
            pet.takePetOut();
        }
    }

    public void sleepAllPets() {
        for (VirtualPet pet : listOfAllPets) {
            pet.sleepPets();
        }
    }

    public void displayAllPetsAndStats() {
        for (VirtualPet pet : listOfAllPets) {
            System.out.print(pet.getKeyPetName() + ":       "
                    + pet.getBoredom() + "        "
                    + pet.getHanger() + "        "
                    + pet.getThirst() + "       "
                    + pet.getPotty() + "           "
                    + pet.getTiredness());
            System.out.println();
        }
    }

    public void displayPetsToPlayWith() {
        for (VirtualPet pet : listOfAllPets) {
            System.out.println(pet.getKeyPetName() + ": " + pet.getPetDescription());
        }
    }
}


