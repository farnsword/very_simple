package someID;

public class RunCarTest {
    public static void main(String[] args) {
        Car daewoo = new Car("Lanos", "Daewoo", 1.0);
        Car volvo = new Car("v40", "Volvo", 3.0);

        System.out.println("First car: brand - " + daewoo.getBrand() + "; model - "
                + daewoo.getModel() + "; engine volume - " + daewoo.getEngineVolume() + ";");
        System.out.println("Second car: brand - " + volvo.getBrand() + "; model - "
                + volvo.getModel() + "; engine volume - " + volvo.getEngineVolume() + ";\n");

        daewoo.setBrand("Daewoo 2.0");
        daewoo.setModel("Sens");
        daewoo.setEngineVolume(1.1);

        volvo.setBrand("Volvo 2.0");
        volvo.setModel("v60");
        volvo.setEngineVolume(3.5);

        System.out.println("First car: brand - " + daewoo.getBrand() + "; model - "
                + daewoo.getModel() + "; engine volume - " + daewoo.getEngineVolume() + ";");
        System.out.println("Second car: brand - " + volvo.getBrand() + "; model - "
                + volvo.getModel() + "; engine volume - " + volvo.getEngineVolume() + ";");
    }
}
