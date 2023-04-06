package pao.laborator5.sealed;
//To seal an interface, we can apply the sealed modifier to its declaration.
// The permits clause then specifies the classes that are permitted to implement the sealed interface:
public sealed interface Service permits Car, Truck {
    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }

}
