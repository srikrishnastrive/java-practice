package queue;
//comparator we don't change in the method 
import java.util.*;

class Car {
    String name;
    String type;
    Car(String name,String type){
        this.name = name;
        this.type = type;
    }
}

public class comparator_2 {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV", "petrol");
        carArray[1] = new Car("Sedan", "diesel");
        carArray[2] = new Car("HatchBack", "cng");

        // Arrays.sort(carArray,(Car obj1,Car obj2) -> obj2.type.compareTo(obj1.type));
        Arrays.sort(carArray,(Car obj1,Car obj2) -> obj1.type.compareTo(obj2.type));
        for (Car car: carArray){
            System.out.println(car.name +"....."+car.type);
        }
    }
}
