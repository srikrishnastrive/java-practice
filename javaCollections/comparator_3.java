import java.util.*;
//comparator we don't change in the method in the class 
class Car {
    String name;
    String type;
    Car(String name,String type){
        this.name = name;
        this.type = type;
    }
}
//implemting function interface 

class CarNameComparator implements Comparator<Car>{
    @Override
    public int compare(Car o1,Car o2){
        return o2.name.compareTo(o1.name);
    }
}


public class comparator_3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("SUV", "petrol"));
        cars.add(new Car("Sedan", "diesel"));
        cars.add( new Car("HatchBack", "cng"));
        Collections.sort(cars,new CarNameComparator());
        cars.forEach((Car carObj)-> System.out.println(carObj.name+"......"+carObj.type));
      
    }
}
