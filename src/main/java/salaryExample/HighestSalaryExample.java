package salaryExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalaryExample {
	
	public static void main(String[] args) {
		
		
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Margi", 1, 5000.0, "Manager"));
	        employees.add(new Employee("Devang", 2, 4000.0, "Engineer"));
	        employees.add(new Employee("Devsya", 3, 6000.0, "Senior Engineer"));
	        employees.add(new Employee("GOGO", 4, 8500.0, "Manager"));

			/*
			 * Optional<Employee> emp = employees.stream()
			 * .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			 */
	        Optional<Double> secondHighestSalary = employees.stream()
	                .map(Employee::getSalary)
	                .distinct()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst();

	        // Find the employee with the second highest salary
	        Optional<Employee> secondHighestSalaryEmployeeName = employees.stream()
	                .filter(e -> e.getSalary() == secondHighestSalary.orElse(0.0))
	                .findFirst();

	        // Print the employee with the second highest salary
	        secondHighestSalaryEmployeeName.ifPresent(System.out::println);
	 
	}

}
