package Medium3.cars;

public abstract class Car implements Cars {
    private int mileage;
    private int yearsOld;
    private int index;
    private String name;
    private double rent;


    public Car(int mileage, int yearsOld, int index, String name) {
        this.mileage = mileage;
        this.yearsOld = yearsOld;
        this.index = index;
        this.name = name;
        this.rent = rent;
    }

    @Override
    public void setRent(double rent) {
        this.rent = rent;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getYearsOld() {
        return yearsOld;
    }

    @Override
    public void printRent() {
        System.out.println("Название: " + name);
        System.out.println("Пробег: " + mileage);
        System.out.println("Возраст: " + yearsOld);
        System.out.println("Стоимость аренды за час: " + rent);
        System.out.println();
    }
}
