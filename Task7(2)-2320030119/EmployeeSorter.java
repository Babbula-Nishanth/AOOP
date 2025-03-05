import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

class SalaryComparatorAscending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

class SalaryComparatorDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "Engineering", 90000));
        employees.add(new Employee(2, "Alice Smith", "Marketing", 75000));
        employees.add(new Employee(3, "Bob Johnson", "Engineering", 95000));
        employees.add(new Employee(4, "Eve White", "HR", 80000));
        employees.add(new Employee(5, "Charlie Brown", "Marketing", 70000));

        System.out.println("Original Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new SalaryComparatorAscending());
        System.out.println("\nSorted by Salary (Ascending):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new SalaryComparatorDescending());
        System.out.println("\nSorted by Salary (Descending):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new NameComparator());
        System.out.println("\nSorted by Name (Alphabetical):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new DepartmentComparator());
        System.out.println("\nSorted by Department (Alphabetical):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
