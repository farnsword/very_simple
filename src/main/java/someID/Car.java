package someID;

public class Car {
    private String model;
    private String brand;
    private double engineVolume;


    public Car(){
        this.model = "default model";
        this.brand = "default brand";
        this.engineVolume = 3.0d;
    }

    public Car(String model, String brand, double engineVolume){
        this.model = model;
        this.brand = brand;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
