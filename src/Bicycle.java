public class Bicycle extends WheelsTransport {

    public Bicycle(String modelName, int countWheels) {
        super(modelName, countWheels);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
