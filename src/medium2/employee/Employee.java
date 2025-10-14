package medium2.employee;

import medium2.Salary;

public abstract class Employee implements Salary {
    private int salary;
    private int bonus;
    private int finalSalary;
    private String name;

    public Employee(int salary, int bonus, String name) {
        this.salary = salary;
        this.bonus = bonus;
        this.name = name;
    }

    public void calculateSalary() {
        finalSalary = bonus + salary;
        System.out.println("Зарплата на должности " + name + " равна " +finalSalary);
    }

}
