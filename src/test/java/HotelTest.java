import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ConferenceRoom conferenceRoom;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Guest guest;
    private Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("Holiday Inn");
        conferenceRoom = new ConferenceRoom("Moscow", 500);
        bedroom = new Bedroom(2, 2, "double", 70);
        bedroom2 = new Bedroom(3, 1, "single", 100);
        guest = new Guest("Barry");
    }

    @Test
    public void checkHotelCanAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addConferenceRoomGuest(guest, conferenceRoom);
        assertEquals(1, hotel.countConferenceRoomGuests(conferenceRoom));
    }

    @Test
    public void checkHotelCanAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addBedroomGuest(guest, bedroom);
        assertEquals(1, hotel.countBedroomGuests(bedroom));
    }

    @Test
    public void canBookBedroom(){
        Booking booking = hotel.bookRoom(bedroom, 5);
        assertEquals(bedroom, booking.getBedroom());
        assertEquals(5, booking.getNights());
    }

    @Test
    public void getVacantBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroomGuest(guest, bedroom);
        hotel.addBedroom(bedroom2);
//        ArrayList<Bedroom> vacantBedrooms = getVacantBedrooms();
        assertEquals(hotel.getVacantBedrooms().size(), 1);
    }


}
