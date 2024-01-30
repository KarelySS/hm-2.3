public class ServiceStation implements Check {
    @Override
    public void check(WheelsTransport wheelsTransport) {
        if (wheelsTransport != null) {
            System.out.println("Обслуживаем " + wheelsTransport.getModelName());
            for (int i = 0; i < wheelsTransport.getCountWheels(); i++) {
                wheelsTransport.updateTyre();
            }
        }
    }

    @Override
    public void check(MotorTransport motorTransport) {
        if (motorTransport != null) {
            System.out.println("Обслуживаем " + motorTransport.getModelName());
            for (int i = 0; i < motorTransport.getCountWheels(); i++) {
                motorTransport.updateTyre();
            }
            motorTransport.checkEngine();
            motorTransport.checkTrailer();
        }
    }
}