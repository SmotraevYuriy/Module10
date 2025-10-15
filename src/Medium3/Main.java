package Medium3;

import Medium3.cars.*;

public class Main {

    public static void main(String[] args) {

        Oka oka = new Oka(5000,10);
        Lada lada = new Lada(4000,12);
        Lamborghini lamborghini = new Lamborghini(1000, 2);
        BMW BMW = new BMW(6000, 18);
        Bugatti bugatti = new Bugatti(2000, 15);
        Lexus lexus = new Lexus(1700, 5);
        Mitsubishi mitsubishi = new Mitsubishi(6854, 7);
        Nissan carNissan = new Nissan(6000, 17);
        Toyota toyota = new Toyota(5000, 7);
        Subaru subaru = new Subaru(4000, 17);
        CarRent carRent = new CarRent(new Car[]{oka, BMW, bugatti, lada, subaru, lexus, lamborghini, mitsubishi,
                carNissan, toyota});
        carRent.calculateRent();
        carRent.printRent();


    }

}
