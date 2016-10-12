package someID;

public abstract class Motorcycles {
    protected String[] types = {"peace of shit and it is not going anywhere.", "Monocycle", "Bicycle", "Trike"};

    protected String brand;
    protected String model;
    protected String name;
    protected String type;
    protected int numberOfWheels;
    protected boolean isCrashed = false;

    public void crash() {
        this.isCrashed = true;
        if (this.numberOfWheels >= 1) {
            this.numberOfWheels -= 1;
            this.type = this.types[numberOfWheels];
        } else {
            this.type = this.types[0];
        }

    }

    public void info() {

        System.out.println(this.brand + " " + this.model + " named " + this.name + " and this is a " + this.type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }


}
