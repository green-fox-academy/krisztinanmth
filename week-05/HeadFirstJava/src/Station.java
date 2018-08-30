import java.util.ArrayList;
import java.util.List;

public class Station {
  int gasAmountOfStation;
  List<Car> carsOfTheStation;

  public Station(int gasAmountOfStation) {
    this.gasAmountOfStation = gasAmountOfStation;
    carsOfTheStation = new ArrayList<>();
  }

  //  refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
  public void refill(Car car) {
    car = new Car();
    gasAmountOfStation -= car.capacity;
    car.gasAmountOfCar++;
  }

  public static void main(String[] args) {
    
  }
}
