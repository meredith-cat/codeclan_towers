import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Isla", 30);
        conferenceRoom2 = new ConferenceRoom("Moscow", 500);
        guest1 = new Guest("Barry");
        guest2 = new Guest("Vladimir");
    }

    @Test
    public void getRoomName(){
        assertEquals("Isla", conferenceRoom1.getName());
    }

    @Test
    public void getCapacity(){
        assertEquals(500, conferenceRoom2.getCapacity());
    }


}
