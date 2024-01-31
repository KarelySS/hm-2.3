public class Main {
    public static void main(String[] args) {
        MotorTransport car = new Car("car1", 4);
        MotorTransport car2 = new Car("car2", 4);

        MotorTransport truck = new Truck("truck1", 6);
        MotorTransport truck2 = new Truck("truck2", 8);
        WheeledTransport bicycle = new Bicycle("bicycle1", 2);
        WheeledTransport bicycle2 = new Bicycle("bicycle2", 2);
        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
