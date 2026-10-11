public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(int roomNumber){
        System.out.println("House keeping is cleaning room " + roomNumber);
    }

    @Override 
    public void doService(){
        cleanRoom(roomNumber);
    }
}