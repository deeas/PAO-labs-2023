package pao.laborator5.sealed;

public class PlayWithSealed {
    public static void main(String[] args) {
        Car car = new Car(3, "B89HXX");
        Truck truck = new Truck(100, "B34THY");

        System.out.println(car.getMaxDistanceBetweenServicesInKilometers());
        System.out.println(truck.getMaxServiceIntervalInMonths());
    }
}
