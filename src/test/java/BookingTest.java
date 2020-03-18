import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1,1,"single", 40);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasNights(){
        assertEquals(5, booking.getNights());
    }

    @Test
    public void calculateTotalRates(){
        assertEquals(200, booking.getTotal());
    }

}
