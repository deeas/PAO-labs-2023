package pao.laborator5.sealed;

//A permitted subclass may also be declared sealed. However, if we declare it non-sealed, then it is open for extension:
public non-sealed class Car extends Vehicle implements Service {
    private final int numberOfSeats;

    public Car(int numberOfSeats, String registrationNumber) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
