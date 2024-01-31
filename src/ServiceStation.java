public class ServiceStation {
    private void check(Transport transport) {

    }

    public void check(WheeledTransport wheelsTransport) {
        wheelsTransport.service();
        if (wheelsTransport != null) {
            System.out.println("Обслуживаем " + wheelsTransport.getModelName());
            for (int i = 0; i < wheelsTransport.getCountWheels(); i++) {
                wheelsTransport.updateTyre();
            }
        }
    }

    public void check(MotorTransport motorTransport) {
        motorTransport.service();
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
