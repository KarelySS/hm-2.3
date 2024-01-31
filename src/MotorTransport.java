public abstract class MotorTransport extends WheeledTransport {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
    }
    public MotorTransport(String modelName, int countWheels) {
        super(modelName, countWheels);
    }
}
