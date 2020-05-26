package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet Argo = new VirtualPet("Argo", "SuperCool", 1, 1, 1, 1, 1, 1);
        VirtualPet Spot = new VirtualPet("Spot", "SuperLame", 1, 1, 1, 1, 1, 1);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.listOfAllPets.add(Argo);
        myShelter.listOfAllPets.add(Spot);
        myShelter.addPet(Argo);
        myShelter.addPet(Spot);
        System.out.println("        __         /    ");
        System.out.println("      (  _ _ _ '_    _  ");
        System.out.println("     __)(-(/(//(-  _)   ");
        System.out.println("          _/_/          ");
        System.out.println();
        System.out.println("       []___");
        System.out.println("      /    /\\");
        System.out.println("     /____/__\\");
        System.out.println("     |[][]||||");
        System.out.println();
        System.out.println("Thank you for volunteering at Sad Seggie's Virtual Pet Shelter!");
        System.out.println();
        while (VirtualPetShelter.gameOn()) {
            System.out.println("This is the status of your pets:");
            System.out.println();
            System.out.println("Name |Boredom  |Hanger  |Thirst  |Potty  |Tiredness  |");
            myShelter.displayAllPetsAndStats();
            System.out.println("Don't let these stats get to 100!");
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Give water to pets");
            System.out.println("3. Take pets outside");
            System.out.println("4. Play with a pet");
            System.out.println("5. Put pets to sleep");
            System.out.println("6. Adopt a pet");
            System.out.println("7. Admit a pet");
            System.out.println("8. Quit");
            int userChoice = input.nextInt();
            if ((userChoice <= 0 || userChoice > 9)) {
                System.out.println("You entered: " + userChoice + ", which is not a valid option");
                myShelter.tickAllPets();
            }
            if (userChoice == 1) {
                System.out.println("You entered: " + userChoice + ". Feed the pets.");
                System.out.println("They are not themselves when they are hungry, but it seems like they are always hungry!");
                System.out.println();
                myShelter.tickAllPets();
                myShelter.feedAllPets();
            }
            if (userChoice == 2) {
                System.out.println("You chose: " + userChoice + ". Give water to all of the pets.");
                System.out.println("They love the virtual water, and they all seem to drinks in 3's.");
                System.out.println();
                myShelter.tickAllPets();
                myShelter.waterToAllPets();
            }
            if (userChoice == 3) {
                System.out.println("You chose: " + userChoice + ". Take pets outside. ");
                System.out.println("Yay, they all went potty!.");
                System.out.println();
                myShelter.tickAllPets();
                myShelter.takeAllPetsOut();
            }
            if (userChoice == 4) {
                System.out.println("You chose: " + userChoice + " Play with a pet");
                System.out.println();
                System.out.println("Ok, which pet would you like to play with?");
                myShelter.displayPetsToPlayWith();
                String petUserEntered = input.next();
                while (!myShelter.hashMapOfPets.containsKey(petUserEntered)) {
                    System.out.println("You have entered an invalid name");
                    System.out.println("Please enter a valid name:");
                    petUserEntered = input.next();
                    myShelter.findPetByKey(petUserEntered);
                }
                myShelter.playWithPet(petUserEntered);
                myShelter.tickAllPets();

            }
            if (userChoice == 5) {
                System.out.println("You chose: " + userChoice + " Put pets to sleep, because they are tired");
                System.out.println();
                System.out.println("Shh, they are all sleeping, until you wake them up.");
                System.out.println();
                myShelter.tickAllPets();
                myShelter.sleepAllPets();
            }
            if (userChoice == 6) {
                System.out.println("Which pet would you like to adopt?");
                String petEnteredToAdopt = input.next();
                while (!myShelter.hashMapOfPets.containsKey(petEnteredToAdopt)) {
                    System.out.println("You have entered an invalid name");
                    System.out.println("Please enter a valid name:");
                    petEnteredToAdopt = input.next();
                    myShelter.findPetByKey(petEnteredToAdopt);
                    System.out.println("Oh no! It looks like we do not have that pet here! Please enter a valid pet name:");
                }
                if (myShelter.hashMapOfPets.containsValue(petEnteredToAdopt)) {
                    myShelter.listOfAllPets.remove(petEnteredToAdopt); //unable to convert input to Object
                }
            }
            if (userChoice == 7) {
                System.out.println("You chose " + userChoice + " What is your pets name that you are admitting?");
                String inputNewPet = input.next();
                while (myShelter.hashMapOfPets.containsKey(inputNewPet)) {
                    System.out.println("Oh no! We already have that pet with that name. Does he have another name it goes by?");
                    inputNewPet = input.next();
                }
                System.out.println("Please describe the pet that you are admitting");
                String inputNewDescription = input.next(); //will crash if you enter a space?
                VirtualPet inputPet = new VirtualPet(inputNewPet, inputNewDescription, 1, 1, 1, 1, 1, 1);
                myShelter.listOfAllPets.add(inputPet);
            }
            if (userChoice == 8) {
                System.out.println("You chose: " + userChoice + ". Quit");
                System.out.println("   _____          __  __ ______ ______      ________ _____ ");
                System.out.println("  / ____|   /\\   |  \\/  |  ____/ __ \\ \\    / /  ____|  __ \\");
                System.out.println(" | |  __   /  \\  | \\  / | |__ | |  | \\ \\  / /| |__  | |__) |");
                System.out.println(" | | |_ | / /\\ \\ | |\\/| |  __|| |  | |\\ \\/ / |  __| |  _  / ");
                System.out.println(" | |__| |/ ____ \\| |  | | |___| |__| | \\  /  | |____| | \\ \\ ");
                System.out.println("  \\_____/_/    \\_\\_|  |_|______\\____/   \\/   |______|_|  \\_\\");
                System.out.println("");
                System.out.println("Fine! Quit! Just like that. It's over.");
                System.exit(0);
            }
        }
    }
}
