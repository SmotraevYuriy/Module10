package medium2.employee;

public class Director extends AbstractEmployee {
    private double bonus;

    public Director(int salary) {
        super(salary, "Директор");
    }

    @Override
    public double calculateBonus() {
        bonus = salary * 0.5;
        return bonus;
    }
}
