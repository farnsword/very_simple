package someID;

public class Motorcycle extends Motorcycles implements MotorcycleType{

    public void vroomVroom(){
        System.out.println("This motorcycle name is " + this.name + " and it said vroom-vroom.");
    }

    public Motorcycle (){
        this.brand = "Yamaha";
        this.model = "y156";
        this.name = "Stella";
        this.numberOfWheels = 2;
        this.type = "";

    }
    public Motorcycle (String brand, String model, String name, int numberOfWheels){
        this.brand = brand;
        this.model = model;
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.type = this.types[numberOfWheels];
    }
}
