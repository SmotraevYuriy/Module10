package medium2.employee;

public class Director extends AbstractEmployee {

    public Director(int salary) {
        super(salary, "Директор");
    }

    @Override
    public double calculateBonus() {
        bonus = salary * 0.5;
        return bonus;
    }
}
