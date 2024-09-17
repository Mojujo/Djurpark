package se.oscar.djurpark;

public class Animal {
    private String name;
    private int age;
    private String gender;
    private String species;

    public Animal(String name, int age, String gender, String species) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getSpecies() { return species; }

    public void animalInfo(String species) {
        switch (species) {
            case "Tiger" -> System.out.println("This is a tiger");
            case "Parrot" -> System.out.println("This is a parrot");
            case "Monkey" -> System.out.println("This is a monkey");
            case null, default -> System.out.println("This animal doesnt exist");
        }
    }

    public void animalSound(String species) {
        switch (species) {
            case "Tiger" -> System.out.println("This animal makes the sound: Rawr");
            case "Parrot" -> System.out.println("This animal makes the sound: Caw-Caw");
            case "Monkey" -> System.out.println("This animal makes the sound: Ook-ook");
            case null, default -> System.out.println("This animal doesnt exist");
        }
    }

    @Override
    public String toString() {
        return ": [Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Species: " + species + "]";
    }
}
