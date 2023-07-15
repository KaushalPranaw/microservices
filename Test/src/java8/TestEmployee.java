package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add employee data
        employees.add(new Employee(1, "John Doe", 50000.0));
        employees.add(new Employee(2, "Jane Smith", 60000.0));
        employees.add(new Employee(3, "Michael Johnson", 70000.0));
        employees.add(new Employee(4, "Emily Davis", 55000.0));
        employees.add(new Employee(5, "Daniel Wilson", 65000.0));

        //Filter employees whose salary is greater than a specific amount:
        //employees.stream().filter(e->e.getSalary()>60000.0).forEach(System.out::println);


        //Find the employee with the highest salary:
        //System.out.println(employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());


        //Calculate the average salary of all employees:
        //System.out.println(employees.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble());

        //Sort the list of employees based on their salaries in descending order:
        /*employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);*/

        //Group employees based on their salary ranges:
        Map<String, List<Employee>> employeesBySalaryRange =employees.stream().collect(Collectors.groupingBy(e -> {
            if (e.getSalary() < 50000) {
                return "Low Salary";
            } else if (e.getSalary() < 100000) {
                return "Medium Salary";
            } else {
                return "High Salary";
            }
        }));
        System.out.println(employeesBySalaryRange);

        //Calculate the total salary of all employees:
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println(totalSalary);

        //Check if there is any employee with a specific name:
        boolean isEmployeeWithNamePresent = employees.stream()
                .anyMatch(e -> e.getName().equals("John Doe"));
        System.out.println(isEmployeeWithNamePresent);

    }
}
