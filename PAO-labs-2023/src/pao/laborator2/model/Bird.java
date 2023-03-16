package pao.laborator2.model;

public class Bird extends Animal {
    private static final int NO_OF_LEGS = 2;

    public Bird(String sound) {
        super(sound);
    }

    // good practice to add this annotation to highlight method is overridden
    @Override
    public void printName() {
        System.out.println("Birds have no name!");
    }

    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    @Override
    public int getNoOfLegs() {
        return NO_OF_LEGS;
    }
}
