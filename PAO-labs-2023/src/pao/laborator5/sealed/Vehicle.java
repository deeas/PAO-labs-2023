package pao.laborator5.sealed;

//Similar to interfaces, we can seal classes by applying the same sealed modifier.
// The permits clause should be defined after any extends or implements clauses:
public abstract sealed class Vehicle permits Car, Truck {

    protected final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

}

