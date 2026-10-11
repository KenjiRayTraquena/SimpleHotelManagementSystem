public class FrontDesk{

public void requestValet(String plateNumber){
    Valet valet = new Valet(plateNumber);
    valet.doService();
}

public void requestHouseKeeping(int roomNumber){
    HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
    houseKeeping.doService();
}

public void requestCart(int numCart){
    Cart cart = new Cart(numCart);
    cart.doService();
}
}