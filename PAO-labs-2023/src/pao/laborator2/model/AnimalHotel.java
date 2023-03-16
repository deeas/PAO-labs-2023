package pao.laborator2.model;

public class AnimalHotel {
    private final static int NO_OF_ROOMS = 10;
    private Animal[] animals = new Animal[NO_OF_ROOMS];
    private final String hotelName = "PAO Hotel";

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getHotelName() {
        return hotelName;
    }
}
