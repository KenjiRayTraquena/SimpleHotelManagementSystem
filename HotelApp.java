public class HotelApp{

    public static void main(String[] args){
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("______________________");
        System.out.println("Hotel Service Requests");
        System.out.println("______________________");

        frontDesk.requestValet("KEN-913");
        frontDesk.requestHouseKeeping(237);
        frontDesk.requestCart(4);
        System.out.println("______________________");
    }

}