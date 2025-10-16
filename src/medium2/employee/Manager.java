package medium2.employee;

public class Manager extends AbstractEmployee {

    public Manager(int salary) {
        super(salary, "Менеджер");
    }


    @Override
    public double calculateBonus() {
        bonus = salary * 0.3;
        return bonus;
    }
}
