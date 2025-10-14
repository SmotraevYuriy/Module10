package Medium3.cars;

public class Cars {
    private Car[] cars;

    public Cars(Car[] cars) {
        this.cars = cars;
    }

    public void printRent() {
        for (Car car : cars) {
            car.rent();
            System.out.println("Стоимость аренды " + car.getName() + " - " + car.getRent());
        }

    }
}
