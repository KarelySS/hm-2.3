public abstract class MotorTransport extends WheelsTransport implements UpdateTyre, CheckEngine,CheckTrailer {


    public MotorTransport(String modelName, int countWheels) {
        super(modelName, countWheels);
    }
}
