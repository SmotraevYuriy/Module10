package Medium3.cars;

public class CarRent {
    private Car[] cars;

    public CarRent(Car[] cars) {
        this.cars = cars;
    }


    public void calculateRent() {
        double rent;
        for (int i = 0; i < cars.length; i++) {
            rent = ((10000 - cars[i].getMileage()) * (20 - cars[i].getYearsOld()) * cars[i].getIndex()) / 1000;
            cars[i].setRent(rent);
        }

    }

    public void printRent() {
        for (Car car : cars) {
            car.printRent();
        }

    }
}
