import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Meredith");
        guest2 = new Guest("John");
    }

    @Test
    public void guestName(){
        assertEquals("Meredith", guest1.getName());
    }
}
