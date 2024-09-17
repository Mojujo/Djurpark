package se.oscar.djurpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Park park = new Park();

        // ATTRIBUTES
        String tempName;
        int tempAge;
        String tempGender;
        String tempSpecies;
        boolean run = true;

        while (run) {
            System.out.println("""
                    
                    **************************
                    Welcome to the animal park
                    What would you like to do?
                    **************************
                    
                    1: Add an animal
                    2: Remove an animal
                    3: Show all animals
                    4: Search for an animal
                    5: Exit""");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Enter the name of the animal: ");
                    tempName = scan.next();
                    System.out.println("Enter the age of the animal: ");
                    tempAge = scan.nextInt();
                    System.out.println("Enter the gender of the animal: ");
                    tempGender = scan.next();
                    System.out.println("Enter the species of the animal: ");
                    tempSpecies = scan.next();
                    park.addAnimal(tempName, tempAge, tempGender, tempSpecies);
                    break;
                case 2:
                    System.out.println("What animal do you wish to remove? Use index from animal list.");
                    park.deleteAnimal(scan.nextInt());
                    break;
                case 3:
                    park.showAnimals();
                    break;
                case 4:
                    System.out.println("""
                            Choose how you would like to search
                            1: Search with name
                            2: Search with age
                            3: Search with gender
                            4: Search with species""");
                    switch (scan.nextInt()) {
                        case 1:
                            System.out.println("Enter the name of the animal: ");
                            park.searchName(scan.next());
                            break;
                        case 2:
                            System.out.println("Enter the age of the animal: ");
                            park.searchAge(scan.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter the gender of the animal: ");
                            park.searchGender(scan.next());
                            break;
                        case 4:
                            System.out.println("Enter the species of the animal: ");
                            park.searchSpecies(scan.next());
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Thanks for browsing our park, see you soon!");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    break;
            }
        }
    }
}
