package someID;


import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void simpleTest(){
        Car volvo = new Car("v40", "Volvo", 3.0d);
        Assert.assertEquals(volvo.getBrand(), "Volvo");
        Assert.assertEquals(volvo.getModel(), "v40");
        Assert.assertEquals(volvo.getEngineVolume(), 3.0d, 0);
    }

}
