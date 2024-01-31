public class Truck extends MotorTransport {

    public Truck(String modelName, int countWheels) {
        super(modelName, countWheels);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
