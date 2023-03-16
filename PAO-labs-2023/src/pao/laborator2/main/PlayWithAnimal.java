package pao.laborator2.main;

import pao.laborator2.model.*;
import pao.laborator2.service.AnimalService;

public class PlayWithAnimal {

    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        AnimalHotel animalHotel = new AnimalHotel();

        Cat cat1 = new Cat("Mimi", "miau", CatBreed.EUROPEAN);
        cat1.setAge(9);

        Bird bird1 = new Bird("cip-cirip");
        bird1.setName("Cip1");
        bird1.setAge(2);

        int i = 0;

        animalService.addAnimal(animalHotel, cat1, i++);
        animalService.addAnimal(animalHotel, bird1, i++);

        animalService.printAnimals(animalHotel);
    }
}
