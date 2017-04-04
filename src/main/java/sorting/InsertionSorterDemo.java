package sorting;

import tdd.Employee;

import java.util.Random;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class InsertionSorterDemo {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        Random r = new Random(10);

        for (int i = 0; i < employees.length; i++) {
            Employee ep = new Employee(
                    r.nextInt(100),
                    "Jamba",
                    "Lada",
                    "jamba@lada.com");

            employees[i] = ep;

            System.out.println(ep.toString());
        }

        InsertionSorter sorter = new InsertionSorter();

        sorter.sort(employees);

        System.out.println("======================== Ordered ============================");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
