public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("Valet is picking up "+plateNumber);
    }

    @Override
    public void doService(){
        pickUpVehicle(plateNumber);
    }

}