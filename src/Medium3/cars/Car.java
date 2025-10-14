package Medium3.cars;

public abstract class Car implements Rent {
    private int mileage;
    private int yearsOld;
    private int index;
    private String name;
    private int rent;


    public Car(int mileage, int yearsOld, int index, String name) {
        this.mileage = mileage;
        this.yearsOld = yearsOld;
        this.index = index;
        this.name = name;
    }

    @Override
    public void rent() {
        rent = ((10000 - mileage)*(20 - yearsOld)* index);
    }

    public String getName() {
        return name;
    }

    public int getRent() {
        return rent;
    }
}
