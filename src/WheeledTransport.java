public abstract class WheeledTransport implements Transport{
    private String modelName;
    private int countWheels;
    public void service(){
        System.out.println("Техника в сервисе");
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public WheeledTransport(String modelName, int countWheels) {
        this.modelName = modelName;
        this.countWheels = countWheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
}

