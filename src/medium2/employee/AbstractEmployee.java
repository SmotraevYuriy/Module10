package medium2.employee;

import medium2.Employee;

public abstract class AbstractEmployee implements Employee {
    protected int salary;
    protected String name;
    private double finalSalary;
    protected double bonus;

    public AbstractEmployee(int salary, String name) {
        this.salary = salary;
        this.name = name;

    }


    @Override
    public int getSalary() {
        return salary;
    }

   @Override
    public abstract double calculateBonus();

    @Override
    public void printSalary() {
        System.out.println("Должность: " + name);
        System.out.println("Ставка:" + salary);
        System.out.println("Бонус: " + calculateBonus());
        System.out.println("Итоговая зарплата: " + finalSalary);
        System.out.println();
    }


    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}
