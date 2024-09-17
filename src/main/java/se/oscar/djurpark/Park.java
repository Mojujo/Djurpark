package se.oscar.djurpark;

import java.util.ArrayList;

public class Park {
    ArrayList<Animal> animalList = new ArrayList<>();
    int i = 0;

    public void addAnimal(String name, int age, String gender, String species) {
        animalList.add(new Animal(name, age, gender, species));
    }

    public void deleteAnimal(int a) {
        animalList.remove(a-1);
    }

    public void showAnimals() {
        for (Animal a : animalList) {
            i = i+1;
            System.out.println(i + " " + a);

        }
        i = 0;
    }
}