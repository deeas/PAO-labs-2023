package pao.laborator2.service;

import pao.laborator2.model.Animal;
import pao.laborator2.model.AnimalHotel;

public class AnimalService {
    public void addAnimal(AnimalHotel animalHotel, Animal animal, int position) {
        animalHotel.getAnimals()[position] = animal;
    }

    public void printAnimals(AnimalHotel animalHotel) {
        System.out.println("Animals in our hotel " + animalHotel.getHotelName());
        for (Animal animal : animalHotel.getAnimals()) {
            if (animal != null) {
                String isA[] = animal.getClass().toString().split("\\.", 0);
                System.out.println(animal.getName() + " is a " + isA[isA.length-1] + " has " + animal.getAge() + " years");
            }
        }
    }
}
