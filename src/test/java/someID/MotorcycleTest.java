package someID;

import org.junit.Assert;
import org.junit.Test;

public class MotorcycleTest {
    @Test
    public void MotoTest(){
        Motorcycle yumi = new Motorcycle("Yamaha", "y16", "Yumi", 1);
        Motorcycle suzy = new Motorcycle("Suzuki", "s600", "Suzy", 3);
        Motorcycle honney = new Motorcycle("Honda", "cb350", "Honney", 2);

        yumi.vroomVroom();
        Assert.assertEquals("Yamaha", yumi.brand);
        yumi.crash();

        Assert.assertEquals("Trike", suzy.type);

        Assert.assertEquals("cb350", honney.model);
        honney.crash();
        Assert.assertEquals("Monocycle" ,honney.type);

        yumi.info();
        suzy.info();
        honney.info();
    }
}
