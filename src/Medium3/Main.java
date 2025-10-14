package Medium3;

import Medium3.cars.*;

public class Main {

    public static void main(String[] args) {

        CarOka carOka = new CarOka(5000,10);
        CarLada carLada = new CarLada(4000,12);
        CarLamborghini carLamborghini = new CarLamborghini(1000, 2);
        CarBMW carBMW = new CarBMW(6000, 18);
        CarBugatti carBugatti = new CarBugatti(2000, 15);
        CarLexus carLexus = new CarLexus(1700, 5);
        CarMitsubishi carMitsubishi = new CarMitsubishi(6854, 7);
        CarNissan carNissan = new CarNissan(6000, 17);
        CarToyota carToyota = new CarToyota(5000, 7);
        CarSubaru carSubaru = new CarSubaru(4000, 17);
        Cars cars = new Cars(new Car[]{carOka, carBMW, carBugatti, carLada, carSubaru, carLexus, carLamborghini, carMitsubishi,
                carNissan, carToyota});
        cars.printRent();


    }

}
