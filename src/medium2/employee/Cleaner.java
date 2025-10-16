package medium2.employee;

public class Cleaner extends AbstractEmployee {
    public Cleaner(int salary) {
        super(salary, "Уборщик");
    }


    @Override
    public double calculateBonus() {
        bonus = salary * 0.1;
        return bonus;
    }
}
