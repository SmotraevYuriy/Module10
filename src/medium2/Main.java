package medium2;

import medium2.employee.Accounting;
import medium2.employee.Cleaner;
import medium2.employee.Director;
import medium2.employee.Manager;

public class Main {
    public static void main(String[] args) {

        Employee cleaner = new Cleaner(1000);
        Employee director = new Director(5000);
        Employee manager = new Manager(3000);

        Accounting accounting = new Accounting(new Employee[]{cleaner, director, manager});
        accounting.calculateSalary();
        accounting.printSalary();
    }
}
