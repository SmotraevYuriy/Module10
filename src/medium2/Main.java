package medium2;

import medium2.employee.Cleaner;
import medium2.employee.Director;
import medium2.employee.Manager;

public class Main {
    public static void main(String[] args) {

        Salary cleaner = new Cleaner(1000, 300);
        cleaner.calculateSalary();
        Salary director = new Director(5000, 2000);
        director.calculateSalary();
        Salary manager = new Manager(3000, 1000);
        manager.calculateSalary();
    }
}
