package medium2.employee;

import medium2.Employee;

public class Accounting {

    private Employee[] employees;

    public Accounting(Employee[] employees) {
        this.employees = employees;
    }

    public void calculateSalary() {
        double finalSalary;
        for (int i = 0; i < employees.length; i++) {
            finalSalary = employees[i].getSalary() + employees[i].calculateBonus();
            employees[i].setFinalSalary(finalSalary);
        }
    }

    public void printSalary() {
        for (int i = 0; i < employees.length; i ++) {
            employees[i].printSalary();
        }
    }
}
