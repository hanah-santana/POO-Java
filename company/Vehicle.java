public class Vehicle {
    // Atrib
    private int id_vehicle;
    private String vehicle_desc;
    private float vehicle_price;

    // Constructor
    public Vehicle(int id_vehicle, String vehicle_desc, float vehicle_price ){
        this.id_vehicle = id_vehicle;
        this.vehicle_desc = vehicle_desc;
        this.vehicle_price = vehicle_price;

    }

    // Methods
    public int getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(int id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public String getVehicle_desc() {
        return vehicle_desc;
    }

    public void setVehicle_desc(String vehicle_desc) {
        this.vehicle_desc = vehicle_desc;
    }

    public float getVehicle_price() {
        return vehicle_price;
    }

    public void setVehicle_price(float vehicle_price) {
        this.vehicle_price = vehicle_price;
    }
}
