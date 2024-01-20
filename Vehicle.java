public class Vehicle {
//    define the attributes of a vehicle
    double speed;
    String vehicleBrand;

    void goVehicle(String brand){
        this.vehicleBrand = brand;
        System.out.println("The " + vehicleBrand +" is moving.....");
    }
    void stopVehicle(){
        System.out.println("The " + vehicleBrand +" has stopped...");
    }
}
