import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 1, "single", 40);
        bedroom2 = new Bedroom(2, 2, "double", 70);
        guest1 = new Guest("Barry");
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom2.countGuests());
    }
}
