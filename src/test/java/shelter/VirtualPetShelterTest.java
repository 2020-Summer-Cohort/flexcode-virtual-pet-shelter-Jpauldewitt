package shelter;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class VirtualPetShelterTest {

    public class VirtualPetShelterTest {
        VirtualPetShelter underTest;
        VirtualPet pet1;
        VirtualPet pet2;

        @Before
        public void setUp() {
            underTest = new VirtualPetShelter();
            pet1 = new VirtualPet("Argo", "SuperCool", 1, 1, 1, 1, 1, 1);
            pet2 = new VirtualPet("Spot", "SuperLame", 1, 1, 1, 1, 1, 1);
        }

        @Test
        public void shouldAddVirtualPet() {
            underTest.addPet(pet1);
            VirtualPet enteredPet = underTest.findPetByKey("Argo");
            Assertions.assertThat(enteredPet).isEqualTo(pet1);
        }

        @Test
        public void shouldAddTwoVirtualPets() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            VirtualPet enteredPet = underTest.findPetByKey("Spot");
            Collection<VirtualPet> allPets = underTest.getListOfAllPets();
            Assertions.assertThat(allPets).contains(pet2, pet1);
        }

        @Test
        public void shouldRemovePet() {
            underTest.addPet(pet1);
            underTest.removePet(pet1);
            VirtualPet enteredPet = underTest.findPetByKey(pet1.getKeyPetName());
            Assertions.assertThat(enteredPet).isNotEqualTo(pet1);
        }

        @Test
        public void shouldSubtractBoredomFromSelectedPetWithPlayWithPet() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            VirtualPet enteredPet = underTest.findPetByKey(pet1.getKeyPetName());
            underTest.playWithPet(pet1.getKeyPetName());
            Assertions.assertThat(pet2.getKeyPetName());
            Assertions.assertThat(pet1.getBoredom()).isEqualTo(0);
            Assertions.assertThat(pet2.getBoredom()).isEqualTo(6);
        }

        @Test
        public void shouldSubtractHangerFromAllPetsWithFeedPets() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            underTest.listOfAllPets.add(pet1);
            underTest.listOfAllPets.add(pet2);
            underTest.feedAllPets();
            Assertions.assertThat(pet1.getHanger()).isEqualTo(1);
            Assertions.assertThat(pet2.getHanger()).isEqualTo(1);
        }

        @Test
        public void shouldSubtractThirstFromAllPetsWaterToAllPets() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            underTest.listOfAllPets.add(pet1);
            underTest.listOfAllPets.add(pet2);
            underTest.waterToAllPets();
            Assertions.assertThat(pet1.getThirst()).isEqualTo(5);
            Assertions.assertThat(pet2.getThirst()).isEqualTo(5);
        }

        @Test
        public void shouldSubtractPottyFromAllPetsWithTakeAllPetsOut() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            underTest.listOfAllPets.add(pet1);
            underTest.listOfAllPets.add(pet2);
            underTest.takeAllPetsOut();
            Assertions.assertThat(pet1.getPotty()).isEqualTo(5);
            Assertions.assertThat(pet2.getPotty()).isEqualTo(5);
        }

        @Test
        public void shouldSubtractTirednessFromAllPetsWithSleepAllPets() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            underTest.listOfAllPets.add(pet1);
            underTest.listOfAllPets.add(pet2);
            underTest.sleepAllPets();
            Assertions.assertThat(pet1.getTiredness()).isEqualTo(5);
            Assertions.assertThat(pet2.getTiredness()).isEqualTo(5);
        }

        @Test
        public void shouldAddTickToAllStatsWithTickAllPets() {
            underTest.addPet(pet1);
            underTest.addPet(pet2);
            underTest.listOfAllPets.add(pet1);
            underTest.listOfAllPets.add(pet2);
            underTest.tickAllPets();
            Assertions.assertThat(pet1.getBoredom()).isEqualTo(7);
            Assertions.assertThat(pet2.getBoredom()).isEqualTo(7);
            Assertions.assertThat(pet1.getHanger()).isEqualTo(7);
            Assertions.assertThat(pet2.getHanger()).isEqualTo(7);
            Assertions.assertThat(pet1.getThirst()).isEqualTo(7);
            Assertions.assertThat(pet2.getThirst()).isEqualTo(7);
            Assertions.assertThat(pet1.getTiredness()).isEqualTo(7);
            Assertions.assertThat(pet2.getTiredness()).isEqualTo(7);
        }
    }
}
