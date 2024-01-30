public class Car extends MotorTransport {


    public Car(String modelName, int countWheels) {
        super(modelName, countWheels);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Прицеп отсутствует");
    }
}


