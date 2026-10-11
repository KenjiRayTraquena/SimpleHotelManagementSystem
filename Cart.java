public class Cart implements HotelService{
    private int numCart;

    public Cart(int numCart){
        this.numCart = numCart;
    }

    public void requestCart(int numCart){
        System.out.println("Requested "+numCart+" cart(s).");
    }

    @Override 
    
    public void doService(){
        requestCart(numCart);
    }

}