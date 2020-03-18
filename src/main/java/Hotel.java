import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> vacantBedrooms;

    public Hotel(String name){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.name = name;
        this.vacantBedrooms = new ArrayList<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addConferenceRoomGuest(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuest(guest);
    }

    public int countConferenceRoomGuests(ConferenceRoom conferenceRoom){
        return conferenceRoom.getGuests().size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addBedroomGuest(Guest guest, Bedroom bedroom){
        if (checkIsEmpty(bedroom)){
            bedroom.addGuest(guest);
        }
    }

    public int countBedroomGuests(Bedroom bedroom){
        return bedroom.getGuests().size();
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
            Booking newBooking = new Booking(bedroom, nights);
            return newBooking;
    }

    public boolean checkIsEmpty(Bedroom bedroom){
        return countBedroomGuests(bedroom) == 0;
    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        vacantBedrooms.clear();
        for (Bedroom bedroom: this.bedrooms){
            if (checkIsEmpty(bedroom)){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }


}
