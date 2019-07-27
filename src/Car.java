public abstract class Car {
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private String modelOfCar;

    public Car(SteeringWheel steeringWheel , Wheel wheel , String modelOfCar){
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.modelOfCar = modelOfCar;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }
}
