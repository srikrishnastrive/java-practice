//polymorphism
//do you want to modify anything inside the car
//overriding the super class function

class Vehicle1 {
    String numberOfVehicle;
    public Vehicle1(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk(){
        System.out.println("honk!!!!!!!!!!!!!!!!!");
    }
    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

class Car extends Vehicle1{
    
    public Car(String numberOfCar){
        super(numberOfCar);
    }
    @Override
    public void honk(){
        System.out.println("Give me the way!!");
    }

  
    
}
class Bus extends Vehicle1 {
  
    public Bus(String numberOfBus){
       super(numberOfBus);
    }

   
   
}

public class topic_5 {
    public static void main(String[] args) {
        Car car = new Car("KA01KJ9876");
        car.printNumberOfVehicle();
        car.honk();
        Bus bus = new Bus("KA098765");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}

