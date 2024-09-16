//inheritance
class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk(){
        System.out.println("honk!!!!!!!!!!!!!!!!!");
    }
    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

class Car extends Vehicle{
    
    public Car(String numberOfCar){
        super(numberOfCar);
    }

  
    
}
class Bus extends Vehicle {
  
    public Bus(String numberOfBus){
       super(numberOfBus);
    }

   
   
}

public class topic_4 {
    public static void main(String[] args) {
        Car car = new Car("KA01KJ9876");
        car.printNumberOfVehicle();
        car.honk();
        Bus bus = new Bus("KA098765");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
