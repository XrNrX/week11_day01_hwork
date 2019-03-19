import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void FullWaterBottle(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        waterBottle.haveADrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
