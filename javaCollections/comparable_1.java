import java.util.*;

class Car implements Comparable<Car> {
    String carName;
    String carType;

    Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compareTo(Car other) {
        return this.carName.compareTo(other.carName);
    }
} 

public class comparable_1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", "petrol"));
        cars.add(new Car("Sedan", "diesel"));
        cars.add(new Car("HatchBack", "cng"));

        Collections.sort(cars);  // Natural ordering based on carName

        cars.forEach(carObj -> System.out.println(carObj.carName + "......" + carObj.carType));
    }
}
