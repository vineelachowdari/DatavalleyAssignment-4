import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(101, "John", "Manager", 50000));
        employees.add(new Employee(102, "Alice", "Developer", 60000));
        employees.add(new Employee(103, "Bob", "Tester", 45000));
        employees.add(new Employee(104, "Carol", "Designer", 55000));

        System.out.println("Unsorted List:");
        printList(employees);

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name:");
        printList(employees);

        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\nSorted by Salary:");
        printList(employees);
    }

    private static void printList(LinkedList<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}